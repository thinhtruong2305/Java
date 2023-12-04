package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.License.Request.LicenseSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Request.LicenseSaveWithUser;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone.LicenseDetail;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone.LicenseWithIdLicenseNameUserNameStatus;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone.LicenseWithUser;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone.LicenseWithVideos;
import com.example.RestfulAPIAndPostgre.Database.DTO.Other.UserAndLicenseNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {UserMapper.class, VideoMapper.class})
public interface LicenseMapper {
    LicenseMapper INSTANCE = Mappers.getMapper(LicenseMapper.class);
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "videos", ignore = true)
    @Mapping(source = "createAt", target = "createAt", dateFormat = "dd/MM/yyyy hh:mm")
    @Mapping(source = "updateAt",target = "updateAt", dateFormat = "dd/MM/yyyy hh:mm")
    @Mapping(target = "status", ignore = true)
    License mapLicenseSaveToLicense(LicenseSave licenseSave);
    @Mapping(target = "videos", ignore = true)
    @Mapping(source = "createAt", target = "createAt", dateFormat = "dd/MM/yyyy hh:mm")
    @Mapping(source = "updateAt",target = "updateAt", dateFormat = "dd/MM/yyyy hh:mm")
    @Mapping(target = "status", ignore = true)
    License mapLicenseSaveWithUserToLicense(LicenseSaveWithUser licenseSaveWithUser);
    /**
     * Đây là hàm trả về 4 dữ liệu dành cho bảng admin license bao gồm
     * licenseId, licenseName, userName, status;*/
    @Mapping(source = "createAt", target = "createAt", dateFormat = "dd/MM/yyyy hh:mm")
    @Mapping(source = "updateAt",target = "updateAt", dateFormat = "dd/MM/yyyy hh:mm")
    LicenseDetail mapLicenseToLicenseDetail(License license);
    @Mapping(source = "user.userName", target = "userName")
    LicenseWithIdLicenseNameUserNameStatus mapLicenseToSummaryForTable(License license);
    @Mapping(source = "videos", target = "videos")
    LicenseWithVideos mapLicenseToLicenseWithVideos(License license);
    @Mapping(source = "user", target = "user")
    LicenseWithUser mapLicenseToLicenseWithUser(License license);
}
