package com.example.RestfulAPIAndPostgre.Repository;

import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import com.example.RestfulAPIAndPostgre.Database.Repository.UserRepository;
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

import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserVideoRepositoryTest {
    //Find
    private static final long VIDEO_ID = 9;
    private static final long USER_ID = 2;
    @Autowired
    VideoRepository videoRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    @Rollback(value = false)
    public void stage_1_addVideoToUser(){
        Optional<Video> videoOptional = videoRepository.findById(VIDEO_ID);
        Optional<User> userOptional = userRepository.findById(USER_ID);
        if(userOptional.isPresent()){
            if(videoOptional.isPresent()){
                userOptional.get().getVideos().add(videoOptional.get());
                User userUpdate = userRepository.save(userOptional.get());
                Assertions.assertNotNull(userUpdate);
            }
        }
    }
    @Test
    @Rollback(value = false)
    public void stage_2_deleteVideoById(){
        boolean isExistBeforeDelete = videoRepository.findById(VIDEO_ID).isPresent();
        videoRepository.deleteById(VIDEO_ID);
        boolean notExistAfterDelete = videoRepository.findById(VIDEO_ID).isPresent();
        Assertions.assertTrue(isExistBeforeDelete);
        Assertions.assertFalse(notExistAfterDelete);
    }
    @Test
    @Rollback(value = false)
    public void stage_3_deleteUserById(){
        boolean isExistBeforeDelete = userRepository.findById(USER_ID).isPresent();
        userRepository.deleteById(USER_ID);
        boolean notExistAfterDelete = userRepository.findById(USER_ID).isPresent();
        Assertions.assertTrue(isExistBeforeDelete);
        Assertions.assertFalse(notExistAfterDelete);
    }
}
