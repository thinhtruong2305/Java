package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.Tag.Request.TagSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.Tag.Respone.TagWithIdParentIdNameStatus;
import com.example.RestfulAPIAndPostgre.Database.DTO.Tag.Respone.TagWithVideos;
import com.example.RestfulAPIAndPostgre.Database.DTO.Tag.TagNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.VideoNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import com.example.RestfulAPIAndPostgre.Database.Entity.Tag.TagBuilder;
import com.example.RestfulAPIAndPostgre.Database.Entity.Video;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-26T23:11:31+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public Tag mapTagCreateToTag(TagSave tagSave) {
        if ( tagSave == null ) {
            return null;
        }

        TagBuilder<?, ?> tag = Tag.builder();

        tag.createAt( tagSave.getCreateAt() );
        tag.updateAt( tagSave.getUpdateAt() );
        tag.createBy( tagSave.getCreateBy() );
        tag.updateBy( tagSave.getUpdateBy() );
        tag.status( tagSave.getStatus() );
        tag.keyword( tagSave.getKeyword() );
        tag.description( tagSave.getDescription() );
        tag.slug( tagSave.getSlug() );
        tag.tagId( tagSave.getTagId() );
        tag.parentId( tagSave.getParentId() );
        tag.tagName( tagSave.getTagName() );

        return tag.build();
    }

    @Override
    public TagDetail mapTagToTagDetail(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagDetail tagDetail = new TagDetail();

        if ( tag.getCreateAt() != null ) {
            tagDetail.setCreateAt( DateTimeFormatter.ofPattern( "dd/MM/yyyy hh:mm" ).format( tag.getCreateAt() ) );
        }
        if ( tag.getUpdateAt() != null ) {
            tagDetail.setUpdateAt( DateTimeFormatter.ofPattern( "dd/MM/yyyy hh:mm" ).format( tag.getUpdateAt() ) );
        }
        tagDetail.setVideosNoRelationship( videoListToVideoNoRelationshipSet( tag.getVideos() ) );
        tagDetail.setTagId( tag.getTagId() );
        tagDetail.setParentId( tag.getParentId() );
        tagDetail.setTagName( tag.getTagName() );
        tagDetail.setCreateBy( tag.getCreateBy() );
        tagDetail.setUpdateBy( tag.getUpdateBy() );
        tagDetail.setStatus( tag.getStatus() );
        tagDetail.setKeyword( tag.getKeyword() );
        tagDetail.setDescription( tag.getDescription() );
        tagDetail.setSlug( tag.getSlug() );

        return tagDetail;
    }

    @Override
    public TagNoRelationship mapTagToTagNoRelationship(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagNoRelationship tagNoRelationship = new TagNoRelationship();

        tagNoRelationship.setTagId( tag.getTagId() );
        tagNoRelationship.setParentId( tag.getParentId() );
        tagNoRelationship.setTagName( tag.getTagName() );

        return tagNoRelationship;
    }

    @Override
    public TagWithVideos mapTagToTagWithVideos(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagWithVideos tagWithVideos = new TagWithVideos();

        tagWithVideos.setVideosNoRelationship( videoListToVideoNoRelationshipSet( tag.getVideos() ) );
        tagWithVideos.setTagId( tag.getTagId() );
        tagWithVideos.setParentId( tag.getParentId() );
        tagWithVideos.setTagName( tag.getTagName() );

        return tagWithVideos;
    }

    @Override
    public TagWithIdParentIdNameStatus mapTagToSummaryForTable(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagWithIdParentIdNameStatus tagWithIdParentIdNameStatus = new TagWithIdParentIdNameStatus();

        tagWithIdParentIdNameStatus.setTagId( tag.getTagId() );
        tagWithIdParentIdNameStatus.setParentId( tag.getParentId() );
        tagWithIdParentIdNameStatus.setTagName( tag.getTagName() );
        tagWithIdParentIdNameStatus.setStatus( tag.getStatus() );

        return tagWithIdParentIdNameStatus;
    }

    @Override
    public TagForGoogleShow mapTagToTagForGoogleShow(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagForGoogleShow tagForGoogleShow = new TagForGoogleShow();

        tagForGoogleShow.setTagId( tag.getTagId() );
        tagForGoogleShow.setTagName( tag.getTagName() );
        tagForGoogleShow.setStatus( tag.getStatus() );
        tagForGoogleShow.setKeyword( tag.getKeyword() );
        tagForGoogleShow.setDescription( tag.getDescription() );
        tagForGoogleShow.setSlug( tag.getSlug() );

        return tagForGoogleShow;
    }

    protected Set<VideoNoRelationship> videoListToVideoNoRelationshipSet(List<Video> list) {
        if ( list == null ) {
            return null;
        }

        Set<VideoNoRelationship> set = new HashSet<VideoNoRelationship>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( Video video : list ) {
            set.add( videoMapper.mapVideoToVideoNoRelationship( video ) );
        }

        return set;
    }
}
