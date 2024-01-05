package com.example.CoolMateSpringboots.UTILS;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateConvert {
    public static Date convertLocalDateToDate(LocalDate localDate) {
        return java.util.Date.from(localDate.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }
    public static LocalDate convertDateToLocalDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
    public static LocalDateTime convertDateToLocalDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
    public static Date convertLocalDateTimeToDate(LocalDateTime localDateTime) {
        return java.sql.Timestamp.valueOf(localDateTime);
    }
}
