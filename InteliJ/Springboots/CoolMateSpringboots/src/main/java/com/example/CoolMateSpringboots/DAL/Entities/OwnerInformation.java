package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntitySearchable;
import com.example.CoolMateSpringboots.UTILS.Convert.StringListConvert;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Owner_Information")
@Access(value=AccessType.FIELD)
public class OwnerInformation extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_information_id")
    private long ownerInformationId;
    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(70) CHARSET utf8")
    private String name;
    @Convert(converter = StringListConvert.class)
    @Column(name = "phone_numbers", nullable = false, columnDefinition = "MEDIUMTEXT CHARSET utf8")
    private List<String> phoneNumbers = new ArrayList<>();
    @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(100)")
    private String email;
    @Convert(converter = StringListConvert.class)
    @Column(name = "addresses", nullable = false, columnDefinition = "LONGTEXT CHARSET utf8")
    private List<String> addresses = new ArrayList<>();
    @OneToMany(mappedBy = "ownerInformation", cascade = CascadeType.REMOVE)
    private List<Image> ownerInformationImages;
}
