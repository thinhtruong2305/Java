package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
import com.example.CoolMateSpringboots.DAL.OtherObject.Enum.Status;
import com.example.CoolMateSpringboots.UTILS.Convert.StringListConvert;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Formula;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Users")
@Access(value=AccessType.FIELD)
public class User extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;
    @Column(name = "first_name", nullable = false, columnDefinition = "VARCHAR(50) CHARSET utf8")
    private String firstName;
    @Column(name = "last_name", nullable = false, columnDefinition = "VARCHAR(50) CHARSET utf8")
    private String lastName;
    @Convert(converter = StringListConvert.class)
    @Column(name = "phone_numbers", unique = true, nullable = false, columnDefinition = "MEDIUMTEXT CHARSET utf8")
    private List<String> phoneNumber;
    @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(100)")
    private String email;
    @Column(name = "age", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date age;
    @Convert(converter = StringListConvert.class)
    @Column(name = "addresses", nullable = false, columnDefinition = "LONGTEXT CHARSET utf8")
    private List<String> address;
    @Column(name = "user_name", unique = true, nullable = false, columnDefinition = "VARCHAR(32)")
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_employee_id")
    @ToString.Exclude
    @JsonIgnore
    private Employee employee;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_customer_id")
    @ToString.Exclude
    @JsonIgnore
    private Customer customer;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
        joinColumns = {@JoinColumn(name = "fk_user_id")},
        inverseJoinColumns = {@JoinColumn(name = "fk_role_id")}
    )
    @ToString.Exclude
    @JsonIgnore
    private List<Role> roles = new ArrayList<>();
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Rate> rates =new ArrayList<>();
}
