package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntitySearchable;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Certifications")
@Access(value=AccessType.FIELD)
public class Certification extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certification_id")
    private long certificationId;
    @Column(name = "certification_name", nullable = false, columnDefinition = "VARCHAR(255) CHARSET utf8")
    private String certificationName;
    @OneToMany(mappedBy = "certification", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Image> images;
}
