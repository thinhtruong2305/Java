package com.example.RestfulAPIAndPostgre.Database.DTO.License.Request;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import com.example.RestfulAPIAndPostgre.Common.Util.Global;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false)
@Data
public class LicenseSaveWithUser extends LicenseSave {
    @NotNull
    private User user;
}
