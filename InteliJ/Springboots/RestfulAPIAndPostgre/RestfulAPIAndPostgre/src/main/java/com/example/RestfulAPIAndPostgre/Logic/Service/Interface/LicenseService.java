package com.example.RestfulAPIAndPostgre.Logic.Service.Interface;

import com.example.RestfulAPIAndPostgre.Database.DTO.License.Request.LicenseSave;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import graphql.schema.DataFetcher;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LicenseService {
    License saveLicense(License license);
    License getLicenseById(long id);
    License getLicenseByName(String name);
    List<License> getLicenses();
    boolean deleteLicenseById(long id);
}
