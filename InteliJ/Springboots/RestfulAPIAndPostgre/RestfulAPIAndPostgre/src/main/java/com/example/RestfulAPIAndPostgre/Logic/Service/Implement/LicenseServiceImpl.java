package com.example.RestfulAPIAndPostgre.Logic.Service.Implement;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Request.LicenseSave;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Database.Repository.LicenseRepository;
import com.example.RestfulAPIAndPostgre.Logic.Mapper.LicenseMapper;
import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.LicenseService;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import javax.annotation.security.RolesAllowed;
import java.util.*;

@Service
public class LicenseServiceImpl implements LicenseService{
    @Autowired
    LicenseRepository licenseRepository;

    @Override
    public License saveLicense(License license) {
        return licenseRepository.save(license);
    }

    @Override
    public License getLicenseById(long id) {
        Optional<License> licenseOptional = licenseRepository.findById(id);
        if(licenseOptional.isPresent())
            return licenseOptional.get();
        return null;
    }

    @Override
    public License getLicenseByName(String name) {
        Optional<License> licenseOptional = licenseRepository.findByLicenseName(name);
        if(licenseOptional.isPresent())
            return licenseOptional.get();
        return null;
    }

    @Override
    public List<License> getLicenses() {
        return licenseRepository.findAll();
    }
    @Override
    public boolean deleteLicenseById(long id) {
        Optional<License> licenseOptional = licenseRepository.findById(id);
        if(licenseOptional.isPresent()){
            licenseRepository.delete(licenseOptional.get());
            return true;
        }
        return false;
    }
}
