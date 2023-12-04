package com.example.RestfulAPIAndPostgre.Database.DTO.User.Respone;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.Data;

@Data
public class UserWithIdUserNameEmailStatus {
    private long userId;
    private String userName;
    private String email;
    private Status status;
}
