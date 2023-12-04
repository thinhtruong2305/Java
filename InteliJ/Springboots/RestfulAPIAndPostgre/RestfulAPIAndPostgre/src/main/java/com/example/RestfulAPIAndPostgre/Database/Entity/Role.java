package com.example.RestfulAPIAndPostgre.Database.Entity;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.BaseEntityUnSearchable;
import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Role extends BaseEntityUnSearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private long roleId;
    @Column(name = "role_name", length = 50, nullable = false, unique = true)
    private String roleName;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "fk_role")},
            inverseJoinColumns = {@JoinColumn(name = "fk_user")})
    @Builder.Default
    @ToString.Exclude
    private List<User> users = new ArrayList<>();

    public Role(OffsetDateTime createAt, String createBy,
                @Nullable OffsetDateTime updateAt, @Nullable String updateBy,
                @Nullable Status status, long roleId, String roleName, List<User> users) {
        super(createAt, createBy, updateAt, updateBy, status);
        this.roleId = roleId;
        this.roleName = roleName;
        this.users = users;
    }
}
