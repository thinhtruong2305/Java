package com.example.RestfulAPIAndPostgre.Common.Model.Entity;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Optional;

@Inheritance
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString
public class BaseEntityUnSearchable {
    @Column(name = "create_at", nullable = false)
    private OffsetDateTime createAt;
    @Column(name = "create_by", length = 50, nullable = false)
    private String createBy;
    @Column(name = "update_at")
    private OffsetDateTime updateAt;
    @Column(name = "update_by", length = 50)
    private String updateBy;
    @Column(name = "status", nullable = false)
    @Enumerated(value = EnumType.STRING)
    @Builder.Default
    private Status status = Status.ACTIVE;

    public BaseEntityUnSearchable(OffsetDateTime createAt, String createBy,
                                  @Nullable OffsetDateTime updateAt, @Nullable String updateBy,
                                  @Nullable Status status) {
        this.createAt = createAt;
        this.createBy = createBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.status = status;
    }
}
