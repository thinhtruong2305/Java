package com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class LicenseDetail {
    private long licenseId;
    @NotBlank(message = "Vui lòng nhập tên")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z]+", message = "Tên chứa kí tự cấm!")
    private String licenseName;
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private OffsetDateTime createAt;
    private String createBy;
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private OffsetDateTime updateAt;
    private String updateBy;
    private String keyword;
    private String description;
    private String slug;
    private Status status;
    private List<Video> videos;
    private User user;
}
