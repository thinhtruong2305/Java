package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Coupons")
@Access(value=AccessType.FIELD)
public class Coupon extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "coupon_id")
    private UUID couponId;
    @Column(name = "discount_percent", nullable = false, columnDefinition = "SMALLINT default 0")
    private short discountPercent;
    @Column(name = "coupon_name", nullable = false, columnDefinition = "VARCHAR(100) CHARSET utf8")
    private String couponName;
    @Column(name = "coupon_event", nullable = false, columnDefinition = "VARCHAR(255) CHARSET utf8")
    private String couponEvent;
    @Column(name = "expiration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;
}
