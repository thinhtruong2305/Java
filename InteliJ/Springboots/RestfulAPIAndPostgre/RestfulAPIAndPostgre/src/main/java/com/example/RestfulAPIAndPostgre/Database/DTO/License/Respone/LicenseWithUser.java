package com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone;

import com.example.RestfulAPIAndPostgre.Database.DTO.User.UserNoRelationship;
import lombok.Data;

@Data
public class LicenseWithUser {
    private long licenseId;
    private String licenseName;
    private UserNoRelationship user;
}
