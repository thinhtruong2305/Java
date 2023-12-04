package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.Other.UserAndLicenseNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-26T23:11:26+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class OtherMapperImpl implements OtherMapper {

    @Override
    public UserAndLicenseNoRelationship mapUserLicenseToUserAndLicense(User user, License license) {
        if ( user == null && license == null ) {
            return null;
        }

        UserAndLicenseNoRelationship userAndLicenseNoRelationship = new UserAndLicenseNoRelationship();

        if ( user != null ) {
            userAndLicenseNoRelationship.setBirthDate( user.getBirthDate() );
            userAndLicenseNoRelationship.setUserId( user.getUserId() );
            userAndLicenseNoRelationship.setUserName( user.getUserName() );
            userAndLicenseNoRelationship.setEmail( user.getEmail() );
            userAndLicenseNoRelationship.setPassword( user.getPassword() );
        }
        if ( license != null ) {
            userAndLicenseNoRelationship.setLicenseId( license.getLicenseId() );
            userAndLicenseNoRelationship.setLicenseName( license.getLicenseName() );
        }

        return userAndLicenseNoRelationship;
    }
}
