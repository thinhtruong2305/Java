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
public class Tag extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private long tagId;
    @Column(name = "parent_id", nullable = false)
    @Builder.Default
    private long parentId = 0;
    @Column(name = "tag_name", length = 20, nullable = false, unique = true)
    private String tagName;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "video_tag",
            joinColumns = {@JoinColumn(name = "fk_tag")},
            inverseJoinColumns = {@JoinColumn(name = "fk_video")})
    @Builder.Default
    @ToString.Exclude
    private List<Video> videos = new ArrayList<>();

    public Tag(OffsetDateTime createAt, String createBy, @Nullable OffsetDateTime updateAt,
               @Nullable String updateBy, @Nullable Status status, @Nullable String keyword,
               @Nullable String description, @Nullable String slug, long tagId, long parentId,
               String tagName, List<Video> videos) {
        super(createAt, createBy, updateAt, updateBy, status, keyword, description, slug);
        this.tagId = tagId;
        this.parentId = parentId;
        this.tagName = tagName;
        this.videos = videos;
    }
}
