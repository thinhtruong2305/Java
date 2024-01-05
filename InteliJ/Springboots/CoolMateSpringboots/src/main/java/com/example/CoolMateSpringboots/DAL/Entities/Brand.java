package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntitySearchable;
import com.example.CoolMateSpringboots.DAL.OtherObject.Enum.Status;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Brands")
@Access(value=AccessType.FIELD)
public class Brand extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private long brandId;
    @Column(name = "brand_name", nullable = false, columnDefinition = "VARCHAR(70) CHARSET utf8")
    private String brandName;
    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private List<Image> brandImages;
    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private List<Product> products = new ArrayList<>();
}
