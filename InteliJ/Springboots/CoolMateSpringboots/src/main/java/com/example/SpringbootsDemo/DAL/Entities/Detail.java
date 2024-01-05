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
@Table(name = "Details")
@Access(value=AccessType.FIELD)
public class Detail extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id")
    private long detailId;
    @Column(name = "feature_topic", nullable = false, columnDefinition = "VARCHAR(200) CHARSET utf8")
    private String detailTopic;
    @Column(name = "detail", nullable = false, columnDefinition = "MEDIUMTEXT CHARSET utf8")
    private String detail;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_product_id")
    private Product product;
}
