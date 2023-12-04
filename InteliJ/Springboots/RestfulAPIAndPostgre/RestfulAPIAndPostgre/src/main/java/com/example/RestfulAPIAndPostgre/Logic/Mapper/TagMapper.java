package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.Tag.Respone.*;
import com.example.RestfulAPIAndPostgre.Database.DTO.Tag.Request.TagSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.Tag.TagNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {VideoMapper.class})
public interface TagMapper {
//    @Mapping(target = "videos", ignore = true)
//    @Mapping(target = "createAt", ignore = true)
//    @Mapping(target = "createBy", ignore = true)
//    @Mapping(target = "updateAt", ignore = true)
//    @Mapping(target = "updateBy", ignore = true)
//    @Mapping(target = "status", ignore = true)
//    Tag mapTagCreateToTag(TagSave tagSave);
//    TagNoRelationship mapTagToTagNoRelationship(Tag tag);
//    @Mapping(source = "videos", target = "videosNoRelationship")
//    TagWithVideos mapTagToTagWithVideos(Tag tag);
//    TagWithIdParentIdNameStatus mapTagToSummaryForTable(Tag tag);
}
