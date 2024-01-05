package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Rates")
@Access(value=AccessType.FIELD)
public class Rate extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rate_id")
    private long rateId;
    @Column(name = "number_of_start", columnDefinition = "TINYINT Default 0")
    private byte numberOfStar;
    @Column(name = "response", nullable = false, columnDefinition = "MEDIUMTEXT CHARSET utf8")
    private String response;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User user;
    @OneToMany(mappedBy = "rate", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Image> images;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_rate",
            joinColumns = {@JoinColumn(name = "fk_rate_id")},
            inverseJoinColumns = {@JoinColumn(name = "fk_product_id")}
    )
    private List<Product> products = new ArrayList<>();
}
