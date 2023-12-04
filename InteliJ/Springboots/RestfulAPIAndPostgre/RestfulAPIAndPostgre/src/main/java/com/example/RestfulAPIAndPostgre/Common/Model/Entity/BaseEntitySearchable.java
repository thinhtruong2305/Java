package com.example.RestfulAPIAndPostgre.Common.Model.Entity;


import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Inheritance
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString
public class BaseEntitySearchable extends BaseEntityUnSearchable{
    @Column(name = "keyword")
    private String keyword;
    @Column(name = "description")
    private String description;
    @Column(name = "slug")
    private String slug;

    public BaseEntitySearchable(OffsetDateTime createAt, String createBy,
                                @Nullable OffsetDateTime updateAt, @Nullable String updateBy,
                                @Nullable Status status, @Nullable String keyword,
                                @Nullable String description, @Nullable String slug) {
        super(createAt, createBy, updateAt, updateBy, status);
        this.keyword = keyword;
        this.description = description;
        this.slug = slug;
    }
}
