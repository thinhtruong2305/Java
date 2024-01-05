package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
import com.example.CoolMateSpringboots.DAL.OtherObject.Enum.Status;
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
@Table(name = "Order_Details")
@Access(value=AccessType.FIELD)
public class OrderDetail extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private long orderDetailId;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "total_of_order_detail", nullable = false, columnDefinition = "DECIMAL(10,2)")
    private double totalOfOrderDetail;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_product_id")
    @ToString.Exclude
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_order_id")
    @ToString.Exclude
    private Order order;
}
