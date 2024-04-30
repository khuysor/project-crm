package com.huysor.crm.projectcrm.utils;
import org.springframework.http.HttpStatus;
public class MessageRespone extends HttpRespone {
    public  MessageRespone(HttpStatus status, String message) {
        super(status, message);
    }
}
