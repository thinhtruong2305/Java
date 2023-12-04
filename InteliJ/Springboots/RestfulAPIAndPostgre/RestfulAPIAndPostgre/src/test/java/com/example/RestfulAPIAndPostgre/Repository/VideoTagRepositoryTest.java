package com.example.RestfulAPIAndPostgre.Repository;

import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import com.example.RestfulAPIAndPostgre.Database.Repository.TagRepository;
import com.example.RestfulAPIAndPostgre.Database.Repository.VideoRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.util.Streamable;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VideoTagRepositoryTest {
    //Find
    private static final long[] TAGS_ID = {5, 7};
    private static final long TAG_ID = 5;
    private static final long VIDEO_ID = 9;
    //Update
    @Autowired
    VideoRepository videoRepository;
    @Autowired
    TagRepository tagRepository;

    @Test
    @Rollback(value = false)
    public void stage_1_addTagToVideo(){
        Optional<Video> videoOptional = videoRepository.findById(VIDEO_ID);
        Streamable<Tag> tags = tagRepository.findByTagIdIn(TAGS_ID);
        if(videoOptional.isPresent()){
            videoOptional.get().getTags().addAll(tags.toList());
            Video videoUpdate = videoRepository.save(videoOptional.get());
            Assertions.assertNotNull(videoUpdate.getTags());
        }
    }
    @Test
    @Rollback(value = false)
    public void stage_2_findTagByVideoId(){
        Streamable<Tag> tags = tagRepository.findByVideos_VideoId(VIDEO_ID);
        tags.forEach(tag -> {
            System.out.println(tag.toString());
        });
        Assertions.assertNotNull(tags);
    }
    @Test
    @Rollback(value = false)
    public void stage_3_deleteVideoById(){
        boolean isExistBeforeDelete = videoRepository.findById(VIDEO_ID).isPresent();
        videoRepository.deleteById(VIDEO_ID);
        boolean notExistAfterDelete = videoRepository.findById(VIDEO_ID).isPresent();
        Assertions.assertTrue(isExistBeforeDelete);
        Assertions.assertFalse(notExistAfterDelete);
    }
    @Test
    @Rollback(value = false)
    public void stage_4_deleteTagById(){
        boolean isExistBeforeDelete = tagRepository.findById(TAG_ID).isPresent();
        tagRepository.deleteById(TAG_ID);
        boolean notExistAfterDelete = tagRepository.findById(TAG_ID).isPresent();
        Assertions.assertTrue(isExistBeforeDelete);
        Assertions.assertFalse(notExistAfterDelete);
    }
}
