package com.example.RestfulAPIAndPostgre.Database.Repository;

import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    Optional<Video> findByVideoName(String videoName);
    Optional<Video> findByKeywordContaining(String keyword);
    List<Video> findByUsers_UserId(long userId);
    List<Video> findByUsers_UserName(String userName);
    List<Video> findByTags_TagId(long tagId);
    List<Video> findByVideoNameOrTagsTagName(String videoName, String tagsTagName);
    List<Video> findByVideoNameOrTags_TagName(String videoName, String tagsTagName);
    Streamable<Video> findByTags_KeywordContaining(String keyword);
    Streamable<Video> findByLicense_KeywordContaining(String keyword);
}
