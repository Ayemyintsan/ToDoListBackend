package com.talent.todolist.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.talent.todolist.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.Locale;

@Getter
@Setter
@NoArgsConstructor

public class HttpResponse<T> {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy hh:mm:ss", timezone = "Asia/Rangoon")
    private Date timeStamp;
    private int httpResponse;
    private HttpStatus httpStatus;
    private String message;
    private Object object;

    public HttpResponse(int httpResponse, HttpStatus httpStatus, String message, Object object) {
        this.timeStamp = new Date();
        this.httpResponse = httpResponse;
        this.httpStatus = httpStatus;
        this.message = message;
        this.object = object;
    }

}
