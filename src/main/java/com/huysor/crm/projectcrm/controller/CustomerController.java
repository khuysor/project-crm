package com.huysor.crm.projectcrm.controller;

import com.huysor.crm.projectcrm.dto.CustomerDTO;
import com.huysor.crm.projectcrm.repository.CustomerRepo;
import com.huysor.crm.projectcrm.services.CustomerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/customer")
public class CustomerController {
    private final CustomerServices customerServices;
    @PostMapping
    public ResponseEntity<?>create(@RequestBody CustomerDTO customerDTO){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
