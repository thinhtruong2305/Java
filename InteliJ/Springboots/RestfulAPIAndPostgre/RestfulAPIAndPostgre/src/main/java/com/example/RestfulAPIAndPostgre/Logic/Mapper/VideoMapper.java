package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request.VideoSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request.VideoSaveWithLicense;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request.VideoSaveWithTags;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request.VideoSaveWithTagsLicense;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Respone.*;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.VideoNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface VideoMapper {
//    @Mapping(target = "users", ignore = true)
//    @Mapping(target = "tags", ignore = true)
//    @Mapping(target = "license", ignore = true)
//    @Mapping(target = "createAt", ignore = true)
//    @Mapping(target = "createBy", ignore = true)
//    @Mapping(target = "updateAt", ignore = true)
//    @Mapping(target = "updateBy", ignore = true)
//    @Mapping(target = "status", ignore = true)
//    Video mapVideoSaveToVideo(VideoSave videoSave);
//    @Mapping(target = "users", ignore = true)
//    @Mapping(target = "tags", ignore = true)
//    Video mapVideoSaveWithLicenseToVideo(VideoSaveWithLicense videoSaveWithLicense);
//    @Mapping(target = "users", ignore = true)
//    @Mapping(target = "license", ignore = true)
//    Video mapVideoSaveWithTagsToVideo(VideoSaveWithTags videoSaveWithTags);
//    @Mapping(target = "users", ignore = true)
//    Video mapVideoSaveWithTagsLicenseToVideo(VideoSaveWithTagsLicense videoSaveWithTagsLicense);
//    VideoNoRelationship mapVideoToVideoNoRelationship(Video video);
//    VideoWithIdNameEpisodeStatus mapVideoToSummaryForTable(Video video);
//    @Mapping(source = "tags", target = "tags")
//    VideoWithTags mapVideoToVideoWithTags(Video video);
//    @Mapping(source = "license", target = "license")
//    @Mapping(source = "tags", target = "tags")
//    VideoWithTagsLicense mapVideoToVideoWithTagsLicense(Video video);
//    @Mapping(source = "users", target = "users")
//    VideoWithUsers mapVideoToVideoWithUsers(Video video);
//    @Mapping(source = "users", target = "users")
//    @Mapping(source = "license", target = "license")
//    VideoWithUsersLicense mapVideoToVideoWithUsersLicense(Video video);
}
