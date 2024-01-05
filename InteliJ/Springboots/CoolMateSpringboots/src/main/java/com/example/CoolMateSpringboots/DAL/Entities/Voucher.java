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
@Table(name = "Vouchers")
@Access(value=AccessType.FIELD)
public class Voucher extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "voucher_id")
    private UUID voucherId;
    @Column(name = "discount_money", nullable = false, columnDefinition = "DECIMAL(10,2) default 0.00")
    private double discountMoney;
    @Column(name = "voucher_name", nullable = false, columnDefinition = "VARCHAR(100) CHARSET utf8")
    private String voucherName;
    @Column(name = "voucher_event", nullable = false, columnDefinition = "VARCHAR(255) CHARSET utf8")
    private String voucherEvent;
    @Column(name = "expiration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;
}
