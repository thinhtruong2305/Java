package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.Role.Request.RoleSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.Role.Respone.RoleWithIdNameStatus;
import com.example.RestfulAPIAndPostgre.Database.DTO.Role.Respone.RoleWithUsers;
import com.example.RestfulAPIAndPostgre.Database.DTO.Role.RoleNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.UserNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import com.example.RestfulAPIAndPostgre.Database.Entity.Role.RoleBuilder;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-26T23:11:29+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Role mapRoleSaveToRole(RoleSave roleSave) {
        if ( roleSave == null ) {
            return null;
        }

        RoleBuilder<?, ?> role = Role.builder();

        role.createAt( roleSave.getCreateAt() );
        role.updateAt( roleSave.getUpdateAt() );
        role.createBy( roleSave.getCreateBy() );
        role.updateBy( roleSave.getUpdateBy() );
        role.status( roleSave.getStatus() );
        role.roleId( roleSave.getRoleId() );
        role.roleName( roleSave.getRoleName() );

        return role.build();
    }

    @Override
    public RoleDetail mapRoleToRoleDetail(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDetail roleDetail = new RoleDetail();

        if ( role.getCreateAt() != null ) {
            roleDetail.setCreateAt( DateTimeFormatter.ofPattern( "dd/MM/yyyy hh:mm" ).format( role.getCreateAt() ) );
        }
        if ( role.getUpdateAt() != null ) {
            roleDetail.setUpdateAt( DateTimeFormatter.ofPattern( "dd/MM/yyyy hh:mm" ).format( role.getUpdateAt() ) );
        }
        roleDetail.setUsersNoRelationship( userListToUserNoRelationshipList( role.getUsers() ) );
        roleDetail.setRoleId( role.getRoleId() );
        roleDetail.setRoleName( role.getRoleName() );
        roleDetail.setCreateBy( role.getCreateBy() );
        roleDetail.setUpdateBy( role.getUpdateBy() );
        roleDetail.setStatus( role.getStatus() );

        return roleDetail;
    }

    @Override
    public RoleWithIdNameStatus mapRoleToSummaryForTable(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleWithIdNameStatus roleWithIdNameStatus = new RoleWithIdNameStatus();

        roleWithIdNameStatus.setRoleId( role.getRoleId() );
        roleWithIdNameStatus.setRoleName( role.getRoleName() );
        roleWithIdNameStatus.setStatus( role.getStatus() );

        return roleWithIdNameStatus;
    }

    @Override
    public RoleWithUsers mapRoleToRoleWithUser(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleWithUsers roleWithUsers = new RoleWithUsers();

        roleWithUsers.setUsersNoRelationship( userListToUserNoRelationshipList( role.getUsers() ) );
        roleWithUsers.setRoleId( role.getRoleId() );
        roleWithUsers.setRoleName( role.getRoleName() );

        return roleWithUsers;
    }

    @Override
    public RoleNoRelationship mapRoleToRoleNoRelationship(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleNoRelationship roleNoRelationship = new RoleNoRelationship();

        roleNoRelationship.setRoleId( role.getRoleId() );
        roleNoRelationship.setRoleName( role.getRoleName() );

        return roleNoRelationship;
    }

    protected List<UserNoRelationship> userListToUserNoRelationshipList(List<User> list) {
        if ( list == null ) {
            return null;
        }

        List<UserNoRelationship> list1 = new ArrayList<UserNoRelationship>( list.size() );
        for ( User user : list ) {
            list1.add( userMapper.mapUserToUserNoRelationship( user ) );
        }

        return list1;
    }
}
