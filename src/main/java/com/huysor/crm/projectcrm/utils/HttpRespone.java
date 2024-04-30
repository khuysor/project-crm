package com.huysor.crm.projectcrm.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
public class HttpRespone extends RuntimeException {
    private final HttpStatus status;
    private final  String message;

    public HttpRespone(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
