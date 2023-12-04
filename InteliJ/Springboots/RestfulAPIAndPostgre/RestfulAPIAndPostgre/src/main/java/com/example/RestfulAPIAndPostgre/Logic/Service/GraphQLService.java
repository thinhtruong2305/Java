package com.example.RestfulAPIAndPostgre.Logic.Service;

import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.LicenseService;
import graphql.GraphQL;
import graphql.scalars.ExtendedScalars;
import graphql.schema.DataFetcher;
import graphql.schema.FieldCoordinates;
import graphql.schema.GraphQLCodeRegistry;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class GraphQLService {
    @Value("classpath:/graphql/schema.graphql")
    private Resource resource;
    private GraphQL graphQl;
    @Autowired
    LicenseService licenseService;

    @PostConstruct
    public void getSchema() throws IOException {
        graphQl = GraphQL.newGraphQL(new SchemaGenerator().makeExecutableSchema(new SchemaParser().parse(resource.getFile()),
                RuntimeWiring.newRuntimeWiring()
                        .type("Query", typeWriting -> typeWriting
                                .dataFetchers(queryMap()))
                        .scalar(ExtendedScalars.DateTime)
                        .scalar(ExtendedScalars.Date)
                        .build())).build();
    }

    public GraphQL getGraphQl(){
        return this.graphQl;
    }

    public Map<String, DataFetcher> queryMap(){
        Map<String, DataFetcher> map = new HashMap<String, DataFetcher>();
        map.put("getLicenses", evn ->
                licenseService.getLicenses()
        );
        map.put("getLicenseById", evn ->
                licenseService.getLicenseById(Integer.parseInt(evn.getArgument("licenseId")))
        );
        map.put("getLicenseByName", evn ->
                licenseService.getLicenseByName(String.valueOf(evn.getArgument("licenseName")))
        );
        return map;
    }
    public Map<String, DataFetcher> mutationMap(){
        Map<String, DataFetcher> map = new HashMap<String, DataFetcher>();
        map.put("saveLicense", evn ->
                licenseService.saveLicense(evn.getArgument("licenseSave"))
        );
        return map;
    }
}
