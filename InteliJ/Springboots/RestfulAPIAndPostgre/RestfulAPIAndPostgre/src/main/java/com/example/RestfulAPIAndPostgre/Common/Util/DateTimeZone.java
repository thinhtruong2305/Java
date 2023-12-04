package com.example.RestfulAPIAndPostgre.Common.Util;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeZone {
    /**
     * @param zone phải được ghi như sau "(Khu vực châu lục)/(thành phố) VD: "Asia/Ho_Chi_Minh"*/
    public static ZonedDateTime getDateTimeNowByZone(String zone){
        LocalDateTime date = LocalDateTime.now();
        ZonedDateTime dateTimeZone = date.atZone(ZoneId.of(zone));
        return dateTimeZone;
    }
    /**
     * @param zone phải được ghi như sau "(Khu vực châu lục)/(thành phố) VD: "Asia/Ho_Chi_Minh"*/
    public static String getDateTimeNowByZoneFormat(String zone){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss Z");
        LocalDateTime date = LocalDateTime.now();
        String dateTimeZoneFormat = date.atZone(ZoneId.of(zone)).format(formatter);
        return dateTimeZoneFormat;
    }
    public static String getDateTimeNowByZoneFormat(OffsetDateTime value, String zone){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss Z");
        String dateTimeZoneFormat = value.atZoneSimilarLocal(ZoneId.of(zone)).format(formatter);
        return dateTimeZoneFormat;
    }
}
