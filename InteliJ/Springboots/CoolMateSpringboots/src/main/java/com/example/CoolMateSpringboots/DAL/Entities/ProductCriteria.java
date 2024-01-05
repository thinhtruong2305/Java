package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
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
@Table(name = "Product_Criterias")
@Access(value=AccessType.FIELD)
public class ProductCriteria extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_criteria_id")
    private long productCriteriaId;
    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(70) CHARSET utf8")
    private String name;
    @Column(name = "type_of_criteria", columnDefinition = "BIT(8) Default 0")
    private byte typeOfCriteria;
    @OneToMany(mappedBy = "productCriteria", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<ProductCriteriaValue> productCriteriaValues;
}
