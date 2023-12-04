package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.License.Request.LicenseSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Request.LicenseSaveWithUser;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone.LicenseWithIdLicenseNameUserNameStatus;
import com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone.LicenseWithVideos;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.VideoNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Database.Entity.License.LicenseBuilder;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-26T23:11:30+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class LicenseMapperImpl implements LicenseMapper {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public License mapLicenseSaveToLicense(LicenseSave licenseSave) {
        if ( licenseSave == null ) {
            return null;
        }

        LicenseBuilder<?, ?> license = License.builder();

        license.createAt( licenseSave.getCreateAt() );
        license.updateAt( licenseSave.getUpdateAt() );
        license.createBy( licenseSave.getCreateBy() );
        license.updateBy( licenseSave.getUpdateBy() );
        license.status( licenseSave.getStatus() );
        license.keyword( licenseSave.getKeyword() );
        license.description( licenseSave.getDescription() );
        license.slug( licenseSave.getSlug() );
        license.licenseId( licenseSave.getLicenseId() );
        license.licenseName( licenseSave.getLicenseName() );

        return license.build();
    }

    @Override
    public License mapLicenseSaveWithUserToLicense(LicenseSaveWithUser licenseSaveWithUser) {
        if ( licenseSaveWithUser == null ) {
            return null;
        }

        LicenseBuilder<?, ?> license = License.builder();

        license.createAt( licenseSaveWithUser.getCreateAt() );
        license.updateAt( licenseSaveWithUser.getUpdateAt() );
        license.createBy( licenseSaveWithUser.getCreateBy() );
        license.updateBy( licenseSaveWithUser.getUpdateBy() );
        license.status( licenseSaveWithUser.getStatus() );
        license.keyword( licenseSaveWithUser.getKeyword() );
        license.description( licenseSaveWithUser.getDescription() );
        license.slug( licenseSaveWithUser.getSlug() );
        license.licenseId( licenseSaveWithUser.getLicenseId() );
        license.licenseName( licenseSaveWithUser.getLicenseName() );
        license.user( licenseSaveWithUser.getUser() );

        return license.build();
    }

    @Override
    public LicenseDetail mapLicenseToDetail(License license) {
        if ( license == null ) {
            return null;
        }

        LicenseDetail licenseDetail = new LicenseDetail();

        if ( license.getCreateAt() != null ) {
            licenseDetail.setCreateAt( DateTimeFormatter.ofPattern( "dd/MM/yyyy hh:mm" ).format( license.getCreateAt() ) );
        }
        if ( license.getUpdateAt() != null ) {
            licenseDetail.setUpdateAt( DateTimeFormatter.ofPattern( "dd/MM/yyyy hh:mm" ).format( license.getUpdateAt() ) );
        }
        licenseDetail.setVideosNoRelationship( videoListToVideoNoRelationshipSet( license.getVideos() ) );
        licenseDetail.setUserNoRelationship( userMapper.mapUserToUserNoRelationship( license.getUser() ) );
        licenseDetail.setLicenseId( license.getLicenseId() );
        licenseDetail.setLicenseName( license.getLicenseName() );
        licenseDetail.setCreateBy( license.getCreateBy() );
        licenseDetail.setUpdateBy( license.getUpdateBy() );
        licenseDetail.setStatus( license.getStatus() );
        licenseDetail.setKeyword( license.getKeyword() );
        licenseDetail.setDescription( license.getDescription() );
        licenseDetail.setSlug( license.getSlug() );

        return licenseDetail;
    }

    @Override
    public LicenseWithIdLicenseNameUserNameStatus mapLicenseToSummaryForTable(License license) {
        if ( license == null ) {
            return null;
        }

        LicenseWithIdLicenseNameUserNameStatus licenseWithIdLicenseNameUserNameStatus = new LicenseWithIdLicenseNameUserNameStatus();

        licenseWithIdLicenseNameUserNameStatus.setUserName( licenseUserUserName( license ) );
        licenseWithIdLicenseNameUserNameStatus.setLicenseId( license.getLicenseId() );
        licenseWithIdLicenseNameUserNameStatus.setLicenseName( license.getLicenseName() );
        licenseWithIdLicenseNameUserNameStatus.setStatus( license.getStatus() );

        return licenseWithIdLicenseNameUserNameStatus;
    }

    @Override
    public LicenseWithVideos mapLicenseToLicenseWithVideos(License license) {
        if ( license == null ) {
            return null;
        }

        LicenseWithVideos licenseWithVideos = new LicenseWithVideos();

        licenseWithVideos.setVideosNoRelationship( videoListToVideoNoRelationshipSet( license.getVideos() ) );
        licenseWithVideos.setLicenseId( license.getLicenseId() );
        licenseWithVideos.setLicenseName( license.getLicenseName() );

        return licenseWithVideos;
    }

    protected Set<VideoNoRelationship> videoListToVideoNoRelationshipSet(List<Video> list) {
        if ( list == null ) {
            return null;
        }

        Set<VideoNoRelationship> set = new HashSet<VideoNoRelationship>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( Video video : list ) {
            set.add( videoMapper.mapVideoToVideoNoRelationship( video ) );
        }

        return set;
    }

    private String licenseUserUserName(License license) {
        if ( license == null ) {
            return null;
        }
        User user = license.getUser();
        if ( user == null ) {
            return null;
        }
        String userName = user.getUserName();
        if ( userName == null ) {
            return null;
        }
        return userName;
    }
}
