package com.example.CoolMateSpringboots.DAL.Entities;

import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntitySearchable;
import com.example.CoolMateSpringboots.DAL.OtherObject.BaseEntityUnsearchable;
import com.example.CoolMateSpringboots.DAL.OtherObject.Enum.Status;
import jakarta.persistence.*;
import lombok.*;

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
@Table(name = "Roles")
@Access(value=AccessType.FIELD)
public class Role extends BaseEntityUnsearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long roleId;
    @Column(name = "role_name", unique = true, nullable = false, columnDefinition = "VARCHAR(50) CHARSET utf8")
    private String roleName;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "fk_role_id")},
            inverseJoinColumns = {@JoinColumn(name = "fk_user_id")})
    @ToString.Exclude
    private List<User> users = new ArrayList<>();
}
