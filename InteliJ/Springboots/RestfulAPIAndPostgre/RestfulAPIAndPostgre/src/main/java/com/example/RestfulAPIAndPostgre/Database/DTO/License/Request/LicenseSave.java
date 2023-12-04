package com.example.RestfulAPIAndPostgre.Database.DTO.License.Request;

import com.example.RestfulAPIAndPostgre.Common.Util.MyString;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
public class LicenseSave {
    private long licenseId;
    @NotBlank(message = "Vui lòng nhập tên")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z]+", message = "Tên chứa kí tự cấm!")
    private String licenseName;
    private OffsetDateTime createAt;
    private String createBy;
    private OffsetDateTime updateAt;
    private String updateBy;
    private String keyword = licenseName;
    private String description;
    private String slug = MyString.generateSlug(licenseName);
}
