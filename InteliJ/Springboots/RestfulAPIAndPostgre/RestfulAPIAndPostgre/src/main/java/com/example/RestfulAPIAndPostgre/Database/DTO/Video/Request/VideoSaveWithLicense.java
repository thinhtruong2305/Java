package com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class VideoSaveWithLicense {
    private long videoId;
    @NotBlank(message = "Xin hãy chọn File video")
    private String videoPath;
    @NotBlank(message = "Xin hãy chọn File image")
    private String imagePath;
    @NotBlank(message = "Vui lòng nhập tên video")
    private String videoName;
    @Min(value = 0, message = "Giá trị không thể nhỏ hơn 0")
    private int episode = 0;
    @Min(value = 0, message = "Giá trị không thể nhỏ hơn 0")
    private int views = 0;
    @NotNull(message = "Xin hãy tạo bản quyền trước khi thêm video")
    private License license;
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private LocalDateTime createAt;
    private String createBy;
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private LocalDateTime updateAt;
    private String updateBy;
    private Status status;
    private String keyword;
    private String description;
    private String slug;
}
