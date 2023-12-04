package com.example.RestfulAPIAndPostgre.Logic.Service.Implement;

import com.example.RestfulAPIAndPostgre.Database.Repository.TagRepository;
import com.example.RestfulAPIAndPostgre.Logic.Mapper.TagMapper;
import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.TagService;
import com.example.RestfulAPIAndPostgre.Database.Entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TagServiceImpl implements TagService {
    @Autowired
    TagRepository tagRepository;
    @Autowired
    TagMapper tagMapper;

    @Override
    public Tag saveTag(Tag tag) {
        if(tag != null)
            return tagRepository.save(tag);
        return null;
    }

    @Override
    public Tag getTagById(long id) {
        Optional<Tag> tagOptional = tagRepository.findById(id);
        if(tagOptional.isPresent())
            return tagOptional.get();
        return null;
    }

    @Override
    public Tag getTagByName(String name) {
        Optional<Tag> tagOptional = tagRepository.findByTagNameAllIgnoreCase(name);
        if(tagOptional.isPresent())
            return tagOptional.get();
        return null;
    }

    @Override
    public List<Tag> getsTag() {
        return tagRepository.findAll();
    }

    @Override
    public boolean deleteTagById(long id) {
        Optional<Tag> tagOptional = tagRepository.findById(id);
        if(tagOptional.isPresent()){
            tagRepository.delete(tagOptional.get());
            return true;
        }
        return false;
    }
}
