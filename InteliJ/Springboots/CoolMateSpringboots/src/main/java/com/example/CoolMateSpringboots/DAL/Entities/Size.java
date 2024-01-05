package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntitySearchable;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Sizes")
@Access(value=AccessType.FIELD)
public class Size extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id")
    private long sizeId;
    @Column(name = "size_name", nullable = false, columnDefinition = "VARCHAR(70) CHARSET utf8")
    private String sizeName;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_clothes_id")
    private Clothes clothes;
}
