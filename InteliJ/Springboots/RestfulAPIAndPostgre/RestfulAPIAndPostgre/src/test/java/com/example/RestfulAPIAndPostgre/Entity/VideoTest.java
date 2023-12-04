package com.example.RestfulAPIAndPostgre.Entity;

import com.example.RestfulAPIAndPostgre.Database.Repository.VideoRepository;
import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
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
public class VideoTest {
    @Autowired
    VideoRepository videoRepository;

    @Test
    @Rollback(value = false)
    public void saveVideo_shouldSaveWithBuilderDefaultValueAndNullable() {
        Video video = Video.builder()
                .videoName("dark blue")
                .episode(1)
                .videoPath("../videos/ntr/video23")
                .imagePath("../images/ntr/img43")
                //.createAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime())
                .createBy("admin1")
                .build();
        Video videoSave = videoRepository.save(video);
        Assertions.assertNotNull(videoSave);
    }

    @Test
    @Rollback(value = false)
    public void saveVideo_shouldSaveWithSetDefaultValueAndNullable() {
        Video video = new Video();
        video.setVideoName("dark blue");
        video.setEpisode(1);
        video.setVideoPath("../videos/ntr/video23");
        video.setImagePath("../images/ntr/img43");
        //video.setCreateAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime());
        video.setCreateBy("admin3");
        Video videoSave = videoRepository.save(video);
        Assertions.assertNotNull(videoSave);
    }

    @Test
    @Rollback(value = false)
    public void saveVideo_shouldSaveWithConstructorDefaultValueAndNullable() {
        Video video = new Video(
                //DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime(),
                null,
                "admin8",
                null, null, null, null, null, null, 0,
                "../videos/ntr/video23",
                "../images/ntr/img43",
                "dark blue",
                1, 0, null, null, null);
        Video videoSave = videoRepository.save(video);
        Assertions.assertNotNull(videoSave);
    }
}
