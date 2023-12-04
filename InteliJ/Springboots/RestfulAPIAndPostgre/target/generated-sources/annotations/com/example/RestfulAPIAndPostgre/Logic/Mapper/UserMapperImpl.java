package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.License.LicenseNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserSaveWithRoles;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserSaveWithVideos;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Respone.UserWithIdUserNameEmailStatus;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Respone.UserWithVideos;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.UserNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.VideoNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Database.Entity.User.UserBuilder;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
public class UserMapperImpl implements UserMapper {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public User mapUserSaveWithRolesToEntity(UserSaveWithRoles userSaveWithRoles) {
        if ( userSaveWithRoles == null ) {
            return null;
        }

        UserBuilder<?, ?> user = User.builder();

        user.createAt( userSaveWithRoles.getCreateAt() );
        user.updateAt( userSaveWithRoles.getUpdateAt() );
        user.birthDate( userSaveWithRoles.getBirthDate() );
        user.createBy( userSaveWithRoles.getCreateBy() );
        user.updateBy( userSaveWithRoles.getUpdateBy() );
        user.status( userSaveWithRoles.getStatus() );
        user.userId( userSaveWithRoles.getUserId() );
        user.userName( userSaveWithRoles.getUserName() );
        user.firstName( userSaveWithRoles.getFirstName() );
        user.lastName( userSaveWithRoles.getLastName() );
        user.email( userSaveWithRoles.getEmail() );
        user.password( userSaveWithRoles.getPassword() );
        user.phoneNumber( userSaveWithRoles.getPhoneNumber() );
        List<Role> list = userSaveWithRoles.getRoles();
        if ( list != null ) {
            user.roles( new ArrayList<Role>( list ) );
        }

        return user.build();
    }

    @Override
    public User mapUserSaveWithVideosToEntity(UserSaveWithVideos userSaveWithVideos) {
        if ( userSaveWithVideos == null ) {
            return null;
        }

        UserBuilder<?, ?> user = User.builder();

        user.createAt( userSaveWithVideos.getCreateAt() );
        user.updateAt( userSaveWithVideos.getUpdateAt() );
        user.birthDate( userSaveWithVideos.getBirthDate() );
        user.createBy( userSaveWithVideos.getCreateBy() );
        user.updateBy( userSaveWithVideos.getUpdateBy() );
        user.status( userSaveWithVideos.getStatus() );
        user.userId( userSaveWithVideos.getUserId() );
        user.userName( userSaveWithVideos.getUserName() );
        user.firstName( userSaveWithVideos.getFirstName() );
        user.lastName( userSaveWithVideos.getLastName() );
        user.email( userSaveWithVideos.getEmail() );
        user.password( userSaveWithVideos.getPassword() );
        user.phoneNumber( userSaveWithVideos.getPhoneNumber() );
        List<Video> list = userSaveWithVideos.getVideos();
        if ( list != null ) {
            user.videos( new ArrayList<Video>( list ) );
        }

        return user.build();
    }

    @Override
    public User mapUserSaveToEntity(UserSave userSave) {
        if ( userSave == null ) {
            return null;
        }

        UserBuilder<?, ?> user = User.builder();

        user.createAt( userSave.getCreateAt() );
        user.updateAt( userSave.getUpdateAt() );
        user.birthDate( userSave.getBirthDate() );
        user.createBy( userSave.getCreateBy() );
        user.updateBy( userSave.getUpdateBy() );
        user.status( userSave.getStatus() );
        user.userId( userSave.getUserId() );
        user.userName( userSave.getUserName() );
        user.firstName( userSave.getFirstName() );
        user.lastName( userSave.getLastName() );
        user.email( userSave.getEmail() );
        user.password( userSave.getPassword() );
        user.phoneNumber( userSave.getPhoneNumber() );

        return user.build();
    }

    @Override
    public UserDetail mapUserToDetail(User user) {
        if ( user == null ) {
            return null;
        }

        UserDetail userDetail = new UserDetail();

        if ( user.getCreateAt() != null ) {
            userDetail.setCreateAt( DateTimeFormatter.ofPattern( "dd/MM/yyyy hh:mm" ).format( user.getCreateAt() ) );
        }
        if ( user.getUpdateAt() != null ) {
            userDetail.setUpdateAt( DateTimeFormatter.ofPattern( "dd/MM/yyyy hh:mm" ).format( user.getUpdateAt() ) );
        }
        userDetail.setBirthDate( user.getBirthDate() );
        userDetail.setVideosNoRelationship( videoListToVideoNoRelationshipSet( user.getVideos() ) );
        userDetail.setLicenseNoRelationship( licenseToLicenseNoRelationship( user.getLicense() ) );
        userDetail.setUserId( user.getUserId() );
        userDetail.setUserName( user.getUserName() );
        userDetail.setFirstName( user.getFirstName() );
        userDetail.setLastName( user.getLastName() );
        userDetail.setEmail( user.getEmail() );
        userDetail.setPassword( user.getPassword() );
        userDetail.setPhoneNumber( user.getPhoneNumber() );
        userDetail.setCreateBy( user.getCreateBy() );
        userDetail.setUpdateBy( user.getUpdateBy() );
        userDetail.setStatus( user.getStatus() );

        return userDetail;
    }

    @Override
    public UserWithVideos mapUserToUserWithVideos(User user) {
        if ( user == null ) {
            return null;
        }

        UserWithVideos userWithVideos = new UserWithVideos();

        userWithVideos.setBirthDate( user.getBirthDate() );
        userWithVideos.setVideosNoRelationship( videoListToVideoNoRelationshipSet( user.getVideos() ) );
        userWithVideos.setUserId( user.getUserId() );
        userWithVideos.setUserName( user.getUserName() );
        userWithVideos.setFirstName( user.getFirstName() );
        userWithVideos.setLastName( user.getLastName() );
        userWithVideos.setEmail( user.getEmail() );
        userWithVideos.setPassword( user.getPassword() );
        userWithVideos.setPhoneNumber( user.getPhoneNumber() );

        return userWithVideos;
    }

    @Override
    public UserWithIdUserNameEmailStatus mapUserToSummaryForTable(User user) {
        if ( user == null ) {
            return null;
        }

        UserWithIdUserNameEmailStatus userWithIdUserNameEmailStatus = new UserWithIdUserNameEmailStatus();

        userWithIdUserNameEmailStatus.setUserId( user.getUserId() );
        userWithIdUserNameEmailStatus.setUserName( user.getUserName() );
        userWithIdUserNameEmailStatus.setEmail( user.getEmail() );
        userWithIdUserNameEmailStatus.setStatus( user.getStatus() );

        return userWithIdUserNameEmailStatus;
    }

    @Override
    public UserNoRelationship mapUserToUserNoRelationship(User user) {
        if ( user == null ) {
            return null;
        }

        UserNoRelationship userNoRelationship = new UserNoRelationship();

        userNoRelationship.setBirthDate( user.getBirthDate() );
        userNoRelationship.setUserId( user.getUserId() );
        userNoRelationship.setUserName( user.getUserName() );
        userNoRelationship.setFirstName( user.getFirstName() );
        userNoRelationship.setLastName( user.getLastName() );
        userNoRelationship.setEmail( user.getEmail() );
        userNoRelationship.setPassword( user.getPassword() );
        userNoRelationship.setPhoneNumber( user.getPhoneNumber() );

        return userNoRelationship;
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

    protected LicenseNoRelationship licenseToLicenseNoRelationship(License license) {
        if ( license == null ) {
            return null;
        }

        LicenseNoRelationship licenseNoRelationship = new LicenseNoRelationship();

        licenseNoRelationship.setLicenseId( license.getLicenseId() );
        licenseNoRelationship.setLicenseName( license.getLicenseName() );

        return licenseNoRelationship;
    }
}
