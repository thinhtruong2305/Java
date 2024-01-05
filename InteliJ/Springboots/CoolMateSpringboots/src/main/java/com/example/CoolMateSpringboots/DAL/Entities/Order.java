package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
import com.example.CoolMateSpringboots.DAL.OtherObject.Enum.Status;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Orders")
@Access(value=AccessType.FIELD)
public class Order extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private UUID orderId;
    @Column(name = "recipient_address", nullable = false, columnDefinition = "VARCHAR(255) CHARSET utf8")
    private String recipientAddress;
    @Column(name = "recipient_phone", nullable = false, columnDefinition = "VARCHAR(15)")
    private String recipientPhone;
    @Column(name = "total_of_order", nullable = false, columnDefinition = "Decimal(10,2)")
    private double totalOfOrder;
    @Column(name = "delivery_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate;
    @OneToOne(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private Employee employee;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_customer_id")
    @ToString.Exclude
    private Customer customer;
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private List<OrderDetail> orderDetails;
}
