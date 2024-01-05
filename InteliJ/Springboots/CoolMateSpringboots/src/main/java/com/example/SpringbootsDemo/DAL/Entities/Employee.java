package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.io.Serializable;
import java.sql.Types;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Employees")
@Access(value=AccessType.FIELD)
public class Employee extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private UUID employeeID;
    @Column(name = "superior_id")
    private UUID superiorId;
    @Column(name = "personal", columnDefinition = "VARCHAR(255) CHARSET utf8")
    private String personal;
    @Column(name = "employee_status")
    private byte employeeStatus;
    @Column(name = "basic_salary", nullable = false, columnDefinition = "Decimal(10,2) default 0.00")
    private double basicSalary;
    @Column(name = "coefficient_salary", columnDefinition = "Decimal(3,2) default 0.00")
    private float coefficientSalary;
    @OneToOne(mappedBy = "employee", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private User user;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "fk_order_id")
    @ToString.Exclude
    private Order order;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private List<Image> images;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_warehouse_id")
    private WareHouse wareHouse;
}
