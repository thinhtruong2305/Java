package com.example.CoolMateSpringboots.UTILS.Convert;

import jakarta.persistence.AttributeConverter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringListConvert implements AttributeConverter<List<String>, String> {
    private static final String SPLIT_CHAR = ";";
    @Override
    public String convertToDatabaseColumn(List<String> strings) {
        return strings != null ? String.join(SPLIT_CHAR, strings) : "";
    }

    @Override
    public List<String> convertToEntityAttribute(String s) {
        return s != null ? Arrays.asList(s.split(SPLIT_CHAR)) : Collections.emptyList();
    }
}
