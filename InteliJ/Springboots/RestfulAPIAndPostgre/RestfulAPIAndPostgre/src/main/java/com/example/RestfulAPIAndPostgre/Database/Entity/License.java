package com.example.RestfulAPIAndPostgre.Database.Entity;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.BaseEntitySearchable;
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
import java.util.UUID;

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
public class License extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "license_id")
    private long licenseId;
    @Column(name = "license_name", nullable = false, unique = true)
    private String licenseName;
    @OneToMany(mappedBy = "license", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @Builder.Default
    @ToString.Exclude
    private List<Video> videos = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    @ToString.Exclude
    private User user;

    public License(OffsetDateTime createAt, String createBy,
                   @Nullable OffsetDateTime updateAt, @Nullable String updateBy,
                   @Nullable Status status, @Nullable String keyword, @Nullable String description,
                   @Nullable String slug, long licenseId, String licenseName, @Nullable List<Video> videos,
                   User user) {
        super(createAt, createBy, updateAt, updateBy, status, keyword, description, slug);
        this.licenseId = licenseId;
        this.licenseName = licenseName;
        this.videos = videos;
        this.user = user;
    }
}
