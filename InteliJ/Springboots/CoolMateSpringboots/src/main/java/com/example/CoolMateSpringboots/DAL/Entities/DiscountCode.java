package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Discount_Codes")
@Access(value=AccessType.FIELD)
public class DiscountCode extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discount_code_id")
    private long discountCodeId;
    @Column(name = "code", nullable = false, columnDefinition = "VARCHAR(20)")
    private String code;
    @Column(name = "expiration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_product_id")
    private Product product;
}
