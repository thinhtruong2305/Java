package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntitySearchable;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Categories")
@Access(value=AccessType.FIELD)
public class Category extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private long categoryId;
    @Column(name = "parent_id")
    private long parentId;
    @Column(name = "category_name", nullable = false, columnDefinition = "VARCHAR(70) CHARSET utf8")
    private String categoryName;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Product> products = new ArrayList<>();
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_ware_house_id")
    private WareHouse wareHouse;
}
