package com.example.RestfulAPIAndPostgre.Database.Repository;

import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    Optional<Tag> findByTagNameAllIgnoreCase(String tagName);
    Streamable<Tag> findByVideos_VideoId(long videoId);
    Streamable<Tag> findByTagIdIn(long... tagId);
    Streamable<Tag> findByKeywordContainingAllIgnoreCase(String keyword);
}
