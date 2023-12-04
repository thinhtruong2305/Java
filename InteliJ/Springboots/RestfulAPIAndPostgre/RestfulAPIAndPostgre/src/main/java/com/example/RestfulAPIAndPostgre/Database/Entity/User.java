package com.example.RestfulAPIAndPostgre.Database.Entity;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.BaseEntityUnSearchable;
import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.*;

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
public class User extends BaseEntityUnSearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long userId;
    @Column(name = "user_name", length = 50, nullable = false, unique = true)
    private String userName;
    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 30, nullable = false)
    private String lastName;
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "phone_number", length = 12, nullable = false)
    private String phoneNumber;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "video_user",
            joinColumns = {@JoinColumn(name = "fk_user")},
            inverseJoinColumns = {@JoinColumn(name = "fk_video")})
    @Builder.Default
    @ToString.Exclude
    private List<Video> videos = new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "fk_user")},
            inverseJoinColumns = {@JoinColumn(name = "fk_role")})
    @Builder.Default
    @ToString.Exclude
    private List<Role> roles = new ArrayList<>();
    @OneToOne(mappedBy = "user", cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private License license;

    public User(OffsetDateTime createAt, String createBy, @Nullable OffsetDateTime updateAt,
                @Nullable String updateBy, @Nullable Status status, long userId, String userName,
                Date birthDate, String email, String password, @Nullable List<Video> videos,
                @Nullable License license, @Nullable List<Role> roles) {
        super(createAt, createBy, updateAt, updateBy, status);
        this.userId = userId;
        this.userName = userName;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.videos = videos;
        this.license = license;
        this.roles = roles;
    }
}