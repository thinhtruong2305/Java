package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Product_Criteria_Values")
@Access(value=AccessType.FIELD)
public class ProductCriteriaValue extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_criteria_value_id")
    private long productCriteriaValueId;
    @Column(name = "value", nullable = false, columnDefinition = "VARCHAR(50) CHARSET utf8")
    private String value;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_product_criteria_id")
    private ProductCriteria productCriteria;
}
