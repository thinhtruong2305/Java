package com.example.CoolMateSpringboots.DAL.OtherObject;

import com.example.CoolMateSpringboots.DAL.OtherObject.Enum.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Inheritance;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.util.Date;

@Inheritance
@MappedSuperclass
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode(callSuper=true)
/**
 * You can search on url bar and google for SEO*/
public class BaseEntitySearchable extends BaseEntityUnsearchable {
    @Column(name = "keyword")
    private String keyword;
    @Column(name = "description")
    private String description;
    @Column(name = "slug")
    private String slug;
}
