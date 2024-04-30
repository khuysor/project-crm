package com.huysor.crm.projectcrm.services;

import com.huysor.crm.projectcrm.dto.CustomerDTO;
import com.huysor.crm.projectcrm.entity.Customers;

import java.util.List;

public interface CustomerServices {
    Customers create(CustomerDTO customerDTO);
    Customers update(Integer id, CustomerDTO customerDTO);
    Customers delete(Integer id);
    Customers findById(Integer id);
    List<Customers> findAll();
}
