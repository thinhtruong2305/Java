package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.License.LicenseNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.Tag.TagNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.UserNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request.VideoSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request.VideoSaveWithLicense;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request.VideoSaveWithTags;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Request.VideoSaveWithTagsLicense;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Respone.VideoWithIdNameEpisodeStatus;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Respone.VideoWithTags;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Respone.VideoWithTagsLicense;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Respone.VideoWithUsers;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.Respone.VideoWithUsersLicense;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.VideoNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video.VideoBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-26T23:11:32+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class VideoMapperImpl implements VideoMapper {

    @Override
    public Video mapVideoSaveToVideo(VideoSave videoSave) {
        if ( videoSave == null ) {
            return null;
        }

        VideoBuilder<?, ?> video = Video.builder();

        video.createAt( videoSave.getCreateAt() );
        video.updateAt( videoSave.getUpdateAt() );
        video.createBy( videoSave.getCreateBy() );
        video.updateBy( videoSave.getUpdateBy() );
        video.status( videoSave.getStatus() );
        video.keyword( videoSave.getKeyword() );
        video.description( videoSave.getDescription() );
        video.slug( videoSave.getSlug() );
        video.videoId( videoSave.getVideoId() );
        video.videoPath( videoSave.getVideoPath() );
        video.imagePath( videoSave.getImagePath() );
        video.videoName( videoSave.getVideoName() );
        video.episode( videoSave.getEpisode() );
        video.views( videoSave.getViews() );

        return video.build();
    }

    @Override
    public Video mapVideoSaveWithLicenseToVideo(VideoSaveWithLicense videoSaveWithLicense) {
        if ( videoSaveWithLicense == null ) {
            return null;
        }

        VideoBuilder<?, ?> video = Video.builder();

        video.createAt( videoSaveWithLicense.getCreateAt() );
        video.updateAt( videoSaveWithLicense.getUpdateAt() );
        video.createBy( videoSaveWithLicense.getCreateBy() );
        video.updateBy( videoSaveWithLicense.getUpdateBy() );
        video.status( videoSaveWithLicense.getStatus() );
        video.keyword( videoSaveWithLicense.getKeyword() );
        video.description( videoSaveWithLicense.getDescription() );
        video.slug( videoSaveWithLicense.getSlug() );
        video.videoId( videoSaveWithLicense.getVideoId() );
        video.videoPath( videoSaveWithLicense.getVideoPath() );
        video.imagePath( videoSaveWithLicense.getImagePath() );
        video.videoName( videoSaveWithLicense.getVideoName() );
        video.episode( videoSaveWithLicense.getEpisode() );
        video.views( videoSaveWithLicense.getViews() );
        video.license( videoSaveWithLicense.getLicense() );

        return video.build();
    }

    @Override
    public Video mapVideoSaveWithTagsToVideo(VideoSaveWithTags videoSaveWithTags) {
        if ( videoSaveWithTags == null ) {
            return null;
        }

        VideoBuilder<?, ?> video = Video.builder();

        video.createAt( videoSaveWithTags.getCreateAt() );
        video.updateAt( videoSaveWithTags.getUpdateAt() );
        video.createBy( videoSaveWithTags.getCreateBy() );
        video.updateBy( videoSaveWithTags.getUpdateBy() );
        video.status( videoSaveWithTags.getStatus() );
        video.keyword( videoSaveWithTags.getKeyword() );
        video.description( videoSaveWithTags.getDescription() );
        video.slug( videoSaveWithTags.getSlug() );
        video.videoId( videoSaveWithTags.getVideoId() );
        video.videoPath( videoSaveWithTags.getVideoPath() );
        video.imagePath( videoSaveWithTags.getImagePath() );
        video.videoName( videoSaveWithTags.getVideoName() );
        video.episode( videoSaveWithTags.getEpisode() );
        video.views( videoSaveWithTags.getViews() );
        List<Tag> list = videoSaveWithTags.getTags();
        if ( list != null ) {
            video.tags( new ArrayList<Tag>( list ) );
        }

        return video.build();
    }

    @Override
    public Video mapVideoSaveWithTagsLicenseToVideo(VideoSaveWithTagsLicense videoSaveWithTagsLicense) {
        if ( videoSaveWithTagsLicense == null ) {
            return null;
        }

        VideoBuilder<?, ?> video = Video.builder();

        video.createAt( videoSaveWithTagsLicense.getCreateAt() );
        video.updateAt( videoSaveWithTagsLicense.getUpdateAt() );
        video.createBy( videoSaveWithTagsLicense.getCreateBy() );
        video.updateBy( videoSaveWithTagsLicense.getUpdateBy() );
        video.status( videoSaveWithTagsLicense.getStatus() );
        video.keyword( videoSaveWithTagsLicense.getKeyword() );
        video.description( videoSaveWithTagsLicense.getDescription() );
        video.slug( videoSaveWithTagsLicense.getSlug() );
        video.videoId( videoSaveWithTagsLicense.getVideoId() );
        video.videoPath( videoSaveWithTagsLicense.getVideoPath() );
        video.imagePath( videoSaveWithTagsLicense.getImagePath() );
        video.videoName( videoSaveWithTagsLicense.getVideoName() );
        video.episode( videoSaveWithTagsLicense.getEpisode() );
        video.views( videoSaveWithTagsLicense.getViews() );
        List<Tag> list = videoSaveWithTagsLicense.getTags();
        if ( list != null ) {
            video.tags( new ArrayList<Tag>( list ) );
        }
        video.license( videoSaveWithTagsLicense.getLicense() );

        return video.build();
    }

    @Override
    public VideoDetail mapVideoToVideoDetail(Video video) {
        if ( video == null ) {
            return null;
        }

        VideoDetail videoDetail = new VideoDetail();

        videoDetail.setCreateAt( video.getCreateAt() );
        videoDetail.setUpdateAt( video.getUpdateAt() );
        videoDetail.setTagsNoRelationship( tagListToTagNoRelationshipSet( video.getTags() ) );
        videoDetail.setUsersNoRelationship( userListToUserNoRelationshipSet( video.getUsers() ) );
        videoDetail.setLicenseNoRelationship( licenseToLicenseNoRelationship( video.getLicense() ) );
        videoDetail.setVideoId( video.getVideoId() );
        videoDetail.setVideoPath( video.getVideoPath() );
        videoDetail.setImagePath( video.getImagePath() );
        videoDetail.setVideoName( video.getVideoName() );
        videoDetail.setEpisode( video.getEpisode() );
        videoDetail.setViews( video.getViews() );
        videoDetail.setCreateBy( video.getCreateBy() );
        videoDetail.setUpdateBy( video.getUpdateBy() );
        videoDetail.setStatus( video.getStatus() );
        videoDetail.setKeyword( video.getKeyword() );
        videoDetail.setDescription( video.getDescription() );
        videoDetail.setSlug( video.getSlug() );

        return videoDetail;
    }

    @Override
    public VideoNoRelationship mapVideoToVideoNoRelationship(Video video) {
        if ( video == null ) {
            return null;
        }

        VideoNoRelationship videoNoRelationship = new VideoNoRelationship();

        videoNoRelationship.setVideoId( video.getVideoId() );
        videoNoRelationship.setVideoPath( video.getVideoPath() );
        videoNoRelationship.setImagePath( video.getImagePath() );
        videoNoRelationship.setVideoName( video.getVideoName() );
        videoNoRelationship.setEpisode( video.getEpisode() );
        videoNoRelationship.setViews( video.getViews() );

        return videoNoRelationship;
    }

    @Override
    public VideoWithIdNameEpisodeStatus mapVideoToSummaryForTable(Video video) {
        if ( video == null ) {
            return null;
        }

        VideoWithIdNameEpisodeStatus videoWithIdNameEpisodeStatus = new VideoWithIdNameEpisodeStatus();

        videoWithIdNameEpisodeStatus.setVideoId( video.getVideoId() );
        videoWithIdNameEpisodeStatus.setVideoName( video.getVideoName() );
        videoWithIdNameEpisodeStatus.setEpisode( video.getEpisode() );
        videoWithIdNameEpisodeStatus.setStatus( video.getStatus() );

        return videoWithIdNameEpisodeStatus;
    }

    @Override
    public VideoWithTags mapVideoToVideoWithTags(Video video) {
        if ( video == null ) {
            return null;
        }

        VideoWithTags videoWithTags = new VideoWithTags();

        videoWithTags.setTagsNoRelationship( tagListToTagNoRelationshipSet( video.getTags() ) );
        videoWithTags.setVideoId( video.getVideoId() );
        videoWithTags.setVideoPath( video.getVideoPath() );
        videoWithTags.setImagePath( video.getImagePath() );
        videoWithTags.setVideoName( video.getVideoName() );
        videoWithTags.setEpisode( video.getEpisode() );
        videoWithTags.setViews( video.getViews() );

        return videoWithTags;
    }

    @Override
    public VideoWithTagsLicense mapVideoToVideoWithTagsLicense(Video video) {
        if ( video == null ) {
            return null;
        }

        VideoWithTagsLicense videoWithTagsLicense = new VideoWithTagsLicense();

        videoWithTagsLicense.setLicenseNoRelationship( licenseToLicenseNoRelationship( video.getLicense() ) );
        videoWithTagsLicense.setTagsNoRelationship( tagListToTagNoRelationshipSet( video.getTags() ) );
        videoWithTagsLicense.setVideoId( video.getVideoId() );
        videoWithTagsLicense.setVideoPath( video.getVideoPath() );
        videoWithTagsLicense.setImagePath( video.getImagePath() );
        videoWithTagsLicense.setVideoName( video.getVideoName() );
        videoWithTagsLicense.setEpisode( video.getEpisode() );
        videoWithTagsLicense.setViews( video.getViews() );

        return videoWithTagsLicense;
    }

    @Override
    public VideoWithUsers mapVideoToVideoWithUsers(Video video) {
        if ( video == null ) {
            return null;
        }

        VideoWithUsers videoWithUsers = new VideoWithUsers();

        videoWithUsers.setUsersNoRelationship( userListToUserNoRelationshipSet( video.getUsers() ) );
        videoWithUsers.setVideoId( video.getVideoId() );
        videoWithUsers.setVideoPath( video.getVideoPath() );
        videoWithUsers.setImagePath( video.getImagePath() );
        videoWithUsers.setVideoName( video.getVideoName() );
        videoWithUsers.setEpisode( video.getEpisode() );
        videoWithUsers.setViews( video.getViews() );

        return videoWithUsers;
    }

    @Override
    public VideoWithUsersLicense mapVideoToVideoWithUsersLicense(Video video) {
        if ( video == null ) {
            return null;
        }

        VideoWithUsersLicense videoWithUsersLicense = new VideoWithUsersLicense();

        videoWithUsersLicense.setUsersNoRelationship( userListToUserNoRelationshipSet( video.getUsers() ) );
        videoWithUsersLicense.setLicenseNoRelationship( licenseToLicenseNoRelationship( video.getLicense() ) );
        videoWithUsersLicense.setVideoId( video.getVideoId() );
        videoWithUsersLicense.setVideoPath( video.getVideoPath() );
        videoWithUsersLicense.setImagePath( video.getImagePath() );
        videoWithUsersLicense.setVideoName( video.getVideoName() );
        videoWithUsersLicense.setEpisode( video.getEpisode() );
        videoWithUsersLicense.setViews( video.getViews() );

        return videoWithUsersLicense;
    }

    protected TagNoRelationship tagToTagNoRelationship(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagNoRelationship tagNoRelationship = new TagNoRelationship();

        tagNoRelationship.setTagId( tag.getTagId() );
        tagNoRelationship.setParentId( tag.getParentId() );
        tagNoRelationship.setTagName( tag.getTagName() );

        return tagNoRelationship;
    }

    protected Set<TagNoRelationship> tagListToTagNoRelationshipSet(List<Tag> list) {
        if ( list == null ) {
            return null;
        }

        Set<TagNoRelationship> set = new HashSet<TagNoRelationship>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( Tag tag : list ) {
            set.add( tagToTagNoRelationship( tag ) );
        }

        return set;
    }

    protected UserNoRelationship userToUserNoRelationship(User user) {
        if ( user == null ) {
            return null;
        }

        UserNoRelationship userNoRelationship = new UserNoRelationship();

        userNoRelationship.setUserId( user.getUserId() );
        userNoRelationship.setUserName( user.getUserName() );
        userNoRelationship.setFirstName( user.getFirstName() );
        userNoRelationship.setLastName( user.getLastName() );
        userNoRelationship.setBirthDate( user.getBirthDate() );
        userNoRelationship.setEmail( user.getEmail() );
        userNoRelationship.setPassword( user.getPassword() );
        userNoRelationship.setPhoneNumber( user.getPhoneNumber() );

        return userNoRelationship;
    }

    protected Set<UserNoRelationship> userListToUserNoRelationshipSet(List<User> list) {
        if ( list == null ) {
            return null;
        }

        Set<UserNoRelationship> set = new HashSet<UserNoRelationship>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( User user : list ) {
            set.add( userToUserNoRelationship( user ) );
        }

        return set;
    }

    protected LicenseNoRelationship licenseToLicenseNoRelationship(License license) {
        if ( license == null ) {
            return null;
        }

        LicenseNoRelationship licenseNoRelationship = new LicenseNoRelationship();

        licenseNoRelationship.setLicenseId( license.getLicenseId() );
        licenseNoRelationship.setLicenseName( license.getLicenseName() );

        return licenseNoRelationship;
    }
}
