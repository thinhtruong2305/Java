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
@Table(name = "Clothes")
@Access(value=AccessType.FIELD)
public class Clothes extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clothes_id")
    private long clothesId;
    @OneToMany(mappedBy = "clothes", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Size> sizes;
    @OneToMany(mappedBy = "clothes", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Material> materials;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_product_id")
    private Product product;
}
