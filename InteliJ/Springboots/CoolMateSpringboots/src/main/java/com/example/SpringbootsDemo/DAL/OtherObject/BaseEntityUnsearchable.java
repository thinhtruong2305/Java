package com.example.CoolMateSpringboots.DAL.OtherObject;

import com.example.CoolMateSpringboots.DAL.OtherObject.Enum.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Inheritance
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * You can't search on url bar and google for SEO*/
public class BaseEntityUnsearchable {
    @Column(name = "create_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "create_by", length = 50, nullable = false)
    private String createBy;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @Column(name = "update_by", length = 50)
    private String updateBy;
    @Column(name = "status", columnDefinition = "BIT(8) Default 0")
    private byte status;
}
