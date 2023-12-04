package com.example.RestfulAPIAndPostgre.Controller.Client;

import com.example.RestfulAPIAndPostgre.Common.Model.Response.BaseResponse;
import com.example.RestfulAPIAndPostgre.Common.Util.Response;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone.LicenseDetail;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserLogin;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Logic.Mapper.LicenseMapper;
import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.LicenseService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@Controller
public class LicenseController {
    @Autowired
    LicenseService licenseService;
    @Autowired
    LicenseMapper licenseMapper;
    @QueryMapping
    public List<License> getLicenses(){
        return licenseService.getLicenses();
    }
    public ResponseEntity<?> getLicenseById(long licenseId){
        return null;
    }
}
