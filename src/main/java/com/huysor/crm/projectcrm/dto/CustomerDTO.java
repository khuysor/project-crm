package com.huysor.crm.projectcrm.dto ;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CustomerDTO   {
    private String name    ;
    private String phone  ;
    private String email  ;
    private String address  ;
    private LocalDateTime createDate  ;
    private LocalDateTime updateDate  ;
}
