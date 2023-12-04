package com.example.RestfulAPIAndPostgre.Entity;

import com.example.RestfulAPIAndPostgre.Database.Repository.TagRepository;
import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TagTest {
    @Autowired
    TagRepository tagRepository;

    @Test
    @Rollback(value = false)
    public void saveTag_shouldSaveWithBuilderDefaultValueAndNullable() {
        Tag tag = Tag.builder()
                .tagName("Orgami")
                //.createAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime())
                .createBy("admin1")
                .build();
        Tag tagSave = tagRepository.save(tag);
        Assertions.assertNotNull(tagSave);
    }

    @Test
    @Rollback(value = false)
    public void saveTag_shouldSaveWithSetDefaultValueAndNullable() {
        Tag tag = new Tag();
        tag.setTagName("Thộn lình");
        //tag.setCreateAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime());
        tag.setCreateBy("admin2");
        Tag tagSave = tagRepository.save(tag);
        Assertions.assertNotNull(tagSave);
    }

    @Test
    @Rollback(value = false)
    public void saveTag_shouldSaveWithConstructorDefaultValueAndNullable() {
        Tag tag = new Tag(
                //DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime(),
                null,
                "admin3",
                null, null, null, null, null, null,
                0, 0, "animal",null);
        Tag tagSave = tagRepository.save(tag);
        Assertions.assertNotNull(tagSave);
    }
}
