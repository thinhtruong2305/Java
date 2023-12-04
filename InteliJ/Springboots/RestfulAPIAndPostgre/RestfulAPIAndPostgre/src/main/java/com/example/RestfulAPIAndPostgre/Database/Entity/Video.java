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
public class Video extends BaseEntitySearchable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "video_id")
    private long videoId;
    @Column(name = "video_path", nullable = false)
    private String videoPath;
    @Column(name = "image_path", nullable = false)
    private String imagePath;
    @Column(name = "video_name", nullable = false, unique = true)
    private String videoName;
    @Column(name = "episode", nullable = false)
    @Builder.Default
    private int episode = 0;
    @Column(name = "views")
    private int views;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "video_tag",
            joinColumns = {@JoinColumn(name = "fk_video")},
            inverseJoinColumns = {@JoinColumn(name = "fk_tag")})
    @Builder.Default
    @ToString.Exclude
    private List<Tag> tags = new ArrayList<>();
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "video_user",
            joinColumns = {@JoinColumn(name = "fk_video")},
            inverseJoinColumns = {@JoinColumn(name = "fk_user")})
    @Builder.Default
    @ToString.Exclude
    private List<User> users =  new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "license_id", nullable = false)
    @ToString.Exclude
    private License license;

    public Video(OffsetDateTime createAt, String createBy, @Nullable OffsetDateTime updateAt,
                 @Nullable String updateBy, @Nullable Status status, @Nullable String keyword,
                 @Nullable String description, @Nullable String slug, long videoId, String videoPath,
                 String imagePath, String videoName, int episode, int views, @Nullable List<Tag> tags,
                 @Nullable List<User> users, License license) {
        super(createAt, createBy, updateAt, updateBy, status, keyword, description, slug);
        this.videoId = videoId;
        this.videoPath = videoPath;
        this.imagePath = imagePath;
        this.videoName = videoName;
        this.episode = episode;
        this.views = views;
        this.tags = tags;
        this.users = users;
        this.license = license;
    }
}