package com.example.RestfulAPIAndPostgre.Repository;

import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Common.Util.Global;
import com.example.RestfulAPIAndPostgre.Common.Util.MyString;
import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import com.example.RestfulAPIAndPostgre.Database.Repository.TagRepository;
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

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TagRepositoryTest {
    private static Tag TAG = new Tag();
    //Create
    private static final String TAG_NAME_CREATE = "animal".toUpperCase();
    //private static final LocalDateTime CREATE_AT = DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime();
    private static final String CREATE_BY = "admin3";
    //Find
    private static final long VIDEO_ID = 5L;
    //Update
    private static final String TAG_NAME_UPDATE = "mind break".toUpperCase();
    //private static final LocalDateTime UPDATE_AT = DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime();
    private static final String UPDATE_BY = "admin2";
    @Autowired
    TagRepository tagRepository;

    @Test
    @Rollback(value = false)
    public void stage_1_saveTag() {
        Tag tag = new Tag();
        tag.setTagName(TAG_NAME_CREATE);
        //tag.setCreateAt(CREATE_AT);
        tag.setCreateBy(CREATE_BY);
        tag.setSlug(MyString.generateSlug(tag.getTagName()));
        Tag tagSave = tagRepository.save(tag);
        TAG = tagSave;
        System.out.println(TAG);
        Assertions.assertNotNull(tagSave);
    }
    @Test
    @Rollback(value = false)
    public void stage_2_findTagById() {
        Optional<Tag> tagOptional = tagRepository.findById(TAG.getTagId());
        if(tagOptional.isPresent())
            System.out.println(tagOptional.get().toString());
        Assertions.assertNotNull(tagOptional.get());
    }
    @Test
    @Rollback(value = false)
    public void stage_3_findTagByName() {
        Optional<Tag> tagOptional = tagRepository.findByTagNameAllIgnoreCase(TAG.getTagName());
        if(tagOptional.isPresent())
            System.out.println(tagOptional.get().toString());
        Assertions.assertNotNull(tagOptional.get());
    }
    @Test
    @Rollback(value = false)
    public void stage_4_findTagByVideoId() {
        Streamable<Tag> tags = tagRepository.findByVideos_VideoId(VIDEO_ID);
        tags.forEach(tag -> {
            System.out.println(tag.toString());
        });
        Assertions.assertNotNull(tags);
    }
    @Test
    @Rollback(value = false)
    public void stage_5_findTagByIds() {
        Streamable<Tag> tags = tagRepository.findByTagIdIn(12L, 13L);
        tags.forEach(tag -> {
            System.out.println(tag.toString());
        });
        Assertions.assertNotNull(tags);
    }
    @Test
    @Rollback(value = false)
    public void stage_6_getAllTag() {
        List<Tag> tags = tagRepository.findAll();
        tags.forEach(tag -> {
            System.out.println(tag.toString());
        });
        Assertions.assertNotNull(tags);
    }
    @Test
    @Rollback(value = false)
    public void stage_7_updateTagById() {
        Optional<Tag> tagOptional = tagRepository.findById(TAG.getTagId());
        if(tagOptional.isPresent()){
            tagOptional.get().setTagName(TAG_NAME_UPDATE);
            //tagOptional.get().setUpdateAt(UPDATE_AT);
            tagOptional.get().setUpdateBy(UPDATE_BY);
            tagRepository.save(tagOptional.get());
        }
        Optional<Tag> tagUpdate = tagRepository.findByTagNameAllIgnoreCase(TAG_NAME_UPDATE);
        if(tagUpdate.isPresent())
            System.out.println(tagUpdate);
        Assertions.assertEquals(tagUpdate.get().getTagName(), TAG_NAME_UPDATE.toUpperCase());
    }

    @Test
    @Rollback(value = false)
    public void stage_8_deleteTagById(){
        boolean isExistBeforeDelete = tagRepository.findById(TAG.getTagId()).isPresent();
        tagRepository.deleteById(TAG.getTagId());
        boolean notExistAfterDelete = tagRepository.findById(TAG.getTagId()).isPresent();
        Assertions.assertTrue(isExistBeforeDelete);
        Assertions.assertFalse(notExistAfterDelete);
    }
}
