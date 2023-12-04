package com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import com.example.RestfulAPIAndPostgre.Common.Util.Global;
import com.example.RestfulAPIAndPostgre.Common.Util.MyString;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class VideoSave {
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
    private String keyword = videoName;
    private String description;
    private String slug = MyString.generateSlug(videoName);
}
