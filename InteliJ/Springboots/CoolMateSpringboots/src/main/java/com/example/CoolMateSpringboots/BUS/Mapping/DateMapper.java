package com.example.CoolMateSpringboots.BUS.Mapping;

import org.mapstruct.Mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Mapper(componentModel = "spring")
public class DateMapper {
    public String asString(Date date) {
        return date != null ? new SimpleDateFormat( "dd/MM/yyyy")
                .format( date ) : null;
    }

    public Date asDate(String date) {
        try {
            return date != null ? new SimpleDateFormat( "dd/MM/yyyy")
                    .parse( date ) : null;
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
    }
}