package com.example.RestfulAPIAndPostgre.Repository;

import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Common.Util.Global;
import com.example.RestfulAPIAndPostgre.Common.Util.MyString;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import com.example.RestfulAPIAndPostgre.Database.Repository.LicenseRepository;
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
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VideoRepositoryTest {
    private static Video VIDEO = new Video();
    //Create
    private static final String VIDEO_NAME_CREATE = MyString.capitalizeEachWord("true blue");
    private static final int VIDEO_EPISODE_CREATE = 1;
    private static final String VIDEO_PATH_CREATE = "../videos/ntr/video23";
    private static final String IMAGE_PATH_CREATE = "../images/ntr/img43";
    //private static final LocalDateTime CREATE_AT = DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime();
    private static final String CREATE_BY = "admin3";
    //Find
    private static final long LICENSE_ID = 14;
    private static final long VIDEO_ID = 15;
    //Update
    private static final String VIDEO_NAME_UPDATE = "white blue";
    //private static final LocalDateTime UPDATE_AT = DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime();
    private static final String UPDATE_BY = "admin2";
    @Autowired
    VideoRepository videoRepository;
    @Autowired
    LicenseRepository licenseRepository;

    @Test
    @Rollback(value = false)
    public void stage_1_saveVideo() {
        Optional<License> licenseOptional = licenseRepository.findById(LICENSE_ID);
        if(licenseOptional.isPresent()){
            Video video = new Video();
            video.setVideoName(VIDEO_NAME_CREATE);
            video.setVideoPath(VIDEO_PATH_CREATE);
            video.setImagePath(IMAGE_PATH_CREATE);
            //video.setCreateAt(CREATE_AT);
            video.setCreateBy(CREATE_BY);
            video.setLicense(licenseOptional.get());
            Video videoSave = videoRepository.save(video);
            VIDEO = videoSave;
            Assertions.assertNotNull(videoSave);
        }
        System.out.println(VIDEO.toString());
    }
    @Test
    @Rollback(value = false)
    public void stage_2_findVideoById(){
        Optional<Video> videoOptional = videoRepository.findById(VIDEO.getVideoId());
        if(videoOptional.isPresent())
            System.out.println(videoOptional.get());
        Assertions.assertNotNull(videoOptional.get());
    }

    @Test
    @Rollback(value = false)
    public void stage_3_findVideoByUserName(){
        Optional<Video> videoOptional = videoRepository.findByVideoName(VIDEO.getVideoName());
        if(videoOptional.isPresent())
            System.out.println(videoOptional.get());
        Assertions.assertNotNull(videoOptional.get());
    }
    @Test
    @Rollback(value = false)
    public void stage_4_getAllVideo(){
        List<Video> videos = videoRepository.findAll();
        videos.forEach(video -> {
            System.out.println(video.toString());
        });
        Assert.notEmpty(videos);
    }
    @Test
    @Rollback(value = false)
    public void stage_5_updateVideoById(){
        Optional<Video> videoOptional = videoRepository.findById(VIDEO.getVideoId());
        if(videoOptional.isPresent()){
            videoOptional.get().setVideoName(VIDEO_NAME_UPDATE);
            //videoOptional.get().setUpdateAt(UPDATE_AT);
            videoOptional.get().setUpdateBy(UPDATE_BY);
            videoRepository.save(videoOptional.get());
        }
        Optional<Video> videoUpdate = videoRepository.findByVideoName(VIDEO_NAME_UPDATE);
        if(videoUpdate.isPresent())
            System.out.println(videoUpdate.get());
        Assertions.assertEquals(videoUpdate.get().getVideoName(), VIDEO_NAME_UPDATE);
    }
    @Test
    @Rollback(value = false)
    public void stage_6_deleteVideoById(){
        boolean isExistBeforeDelete = videoRepository.findById(VIDEO_ID).isPresent();
        videoRepository.deleteById(VIDEO_ID);
        boolean notExistAfterDelete = videoRepository.findById(VIDEO_ID).isPresent();
        Assertions.assertTrue(isExistBeforeDelete);
        Assertions.assertFalse(notExistAfterDelete);
    }
}
