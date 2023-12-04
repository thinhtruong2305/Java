package com.example.RestfulAPIAndPostgre.Common.Model.Response;

import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import lombok.*;

@Data
@NoArgsConstructor
public class BaseResponse<T> {
    private String message;
    private String timeStamp = DateTimeZone.getDateTimeNowByZoneFormat("Asia/Ho_Chi_Minh");
    private T data;

    public BaseResponse(String message) {
        this.message = message;
        timeStamp = DateTimeZone.getDateTimeNowByZoneFormat("Asia/Ho_Chi_Minh");
    }
    public BaseResponse(String message, T data){
        this(message);
        this.data = data;
    }
}
