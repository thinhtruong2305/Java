package com.example.RestfulAPIAndPostgre.Controller.GraphQL;

import com.example.RestfulAPIAndPostgre.Common.Model.Response.BaseResponse;
import com.example.RestfulAPIAndPostgre.Common.Util.Response;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone.LicenseDetail;
import com.example.RestfulAPIAndPostgre.Logic.Mapper.LicenseMapper;
import com.example.RestfulAPIAndPostgre.Logic.Service.GraphQLService;
import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.LicenseService;
import graphql.ExecutionResult;
import graphql.spring.web.servlet.components.GraphQLRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import java.util.Map;
import java.util.stream.Stream;

@RestController
@RequestMapping("graphql")
public class GraphQLController {
    @Autowired
    GraphQLService graphQLService;
    @Autowired
    LicenseService licenseService;
    @Autowired
    LicenseMapper licenseMapper;

    @PostMapping
    @Secured("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<ExecutionResult> excuteGraphQl(@RequestBody GraphQLRequestBody query){
        try{
            if(query.getQuery() != null)
                return Response.generateResponse(new BaseResponse<ExecutionResult>("GraphQL của bạn là", graphQLService.getGraphQl().execute(query.getQuery())), HttpStatus.OK);
            return Response.generateResponse(new BaseResponse<ExecutionResult>("GraphQL của bạn là", graphQLService.getGraphQl().execute(query.getVariables().get("query").toString())), HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(new Error(e.getMessage()));
        }
    }
}
