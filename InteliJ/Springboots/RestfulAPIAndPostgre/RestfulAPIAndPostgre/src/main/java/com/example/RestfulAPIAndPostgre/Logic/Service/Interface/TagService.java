package com.example.RestfulAPIAndPostgre.Logic.Service.Interface;

import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagService {
    Tag saveTag(Tag tag);
    Tag getTagById(long id);
    Tag getTagByName(String name);
    List<Tag> getsTag();
    boolean deleteTagById(long id);
}
