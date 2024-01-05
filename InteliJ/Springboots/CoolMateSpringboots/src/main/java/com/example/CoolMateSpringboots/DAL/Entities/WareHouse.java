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
@Table(name = "WareHouses")
@Access(value=AccessType.FIELD)
public class WareHouse extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ware_house_id")
    private long wareHouseId;
    @Column(name = "ware_house_name", nullable = false, columnDefinition = "VARCHAR(255) CHARSET utf8")
    private String name;
    @Column(name = "ware_house_address", nullable = false, columnDefinition = "VARCHAR(255) CHARSET utf8")
    private String address;
    @OneToMany(mappedBy = "wareHouse", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Employee> employees;
    @OneToMany(mappedBy = "wareHouse", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Category> categories;
}
