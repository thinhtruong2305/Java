package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.Entities.Brand;
import com.example.CoolMateSpringboots.DAL.Entities.Category;
import com.example.CoolMateSpringboots.DAL.Entities.OrderDetail;
import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntitySearchable;
import com.example.CoolMateSpringboots.DAL.OtherObject.Enum.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "Products")
@Access(value=AccessType.FIELD)
public class Product extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;
    @Column(name = "accompanying_gift_id")
    private long accompanyingGift;
    @Column(name = "quantity_accompanying_gift_id", columnDefinition = "SMALLINT default 0")
    private short quantityAccompanyingGift;
    @Column(name = "product_name", nullable = false, columnDefinition = "VARCHAR(70) CHARSET utf8")
    private String productName;
    @Column(name = "quantity", nullable = false, columnDefinition = "INT default 0")
    private int quantity;
    @Column(name = "price", nullable = false, columnDefinition = "DECIMAL(10,2) default 0.00")
    private double price;
    @Column(name = "discount", nullable = false, columnDefinition = "SMALLINT default 0")
    private short discount;
    @Column(name = "views", columnDefinition = "BIGINT default 0")
    private long views;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_category_id")
    @ToString.Exclude
    private Category category;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_brand_id")
    @ToString.Exclude
    private Brand brand;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private List<OrderDetail> orderDetails;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_rate",
            joinColumns = {@JoinColumn(name = "fk_product_id")},
            inverseJoinColumns = {@JoinColumn(name = "fk_rate_id")}
    )
    @ToString.Exclude
    private List<Rate> rates = new ArrayList<>();
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private List<Image> productImages;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<DiscountCode> discountCodes;
    @OneToOne(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private Detail detail;
    @OneToOne(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private Clothes clothes;
}
