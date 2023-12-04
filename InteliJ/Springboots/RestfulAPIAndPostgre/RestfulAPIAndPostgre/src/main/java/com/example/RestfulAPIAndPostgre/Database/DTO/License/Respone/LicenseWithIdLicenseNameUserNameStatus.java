package com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.Data;

@Data
public class LicenseWithIdLicenseNameUserNameStatus {
    private long licenseId;
    private String licenseName;
    private String userName;
    private Status status;
}
