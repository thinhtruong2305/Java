package com.example.RestfulAPIAndPostgre.Database.DTO.Tag.Request;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import com.example.RestfulAPIAndPostgre.Common.Util.Global;
import com.example.RestfulAPIAndPostgre.Common.Util.MyString;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Data
public class TagSave {
    private long tagId;
    @Min(value = 0, message = "Giá trị không thể nhỏ hơn 0")
    private long parentId = 0;
    @NotBlank(message = "Vui lòng nhập tên thể loại")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+", message = "Tên chứa kí tự cấm!")
    private String tagName;
    private String keyword = tagName;
    private String description;
    private String slug = MyString.generateSlug(tagName);
}
