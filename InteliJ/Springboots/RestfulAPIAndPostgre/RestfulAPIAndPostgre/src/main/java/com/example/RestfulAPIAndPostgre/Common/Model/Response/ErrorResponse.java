package com.example.RestfulAPIAndPostgre.Common.Model.Response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ErrorResponse<T> extends BaseResponse {
    private int code;
    private String status;
    private String stackTrace;

    public ErrorResponse(String message, @NotNull HttpStatus status) {
        super(message);
        this.code = status.value();
        this.status = status.name();
    }
    public ErrorResponse(String message, @NotNull HttpStatus status, T error) {
        super(message, error);
        this.code = status.value();
        this.status = status.name();
    }
    public ErrorResponse(String message, HttpStatus status, String stackTrace, T error){
        this(message, status, error);
        this.stackTrace = stackTrace;
    }
}
