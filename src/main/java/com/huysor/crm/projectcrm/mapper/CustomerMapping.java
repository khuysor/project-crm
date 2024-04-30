package com.huysor.crm.projectcrm.mapper;

import com.huysor.crm.projectcrm.dto.CustomerDTO;
import com.huysor.crm.projectcrm.entity.Customers;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapping {
   CustomerMapping INSTANCE= Mappers.getMapper(CustomerMapping.class);
   Customers toCustomers(CustomerDTO customerDTO);
   CustomerDTO tocustomerDTO(Customers customers);
}
