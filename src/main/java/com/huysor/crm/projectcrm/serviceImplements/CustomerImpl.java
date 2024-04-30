package com.huysor.crm.projectcrm.serviceImplements;

import com.huysor.crm.projectcrm.dto.CustomerDTO;
import com.huysor.crm.projectcrm.entity.Customers;
import com.huysor.crm.projectcrm.mapper.CustomerMapping;
import com.huysor.crm.projectcrm.repository.CustomerRepo;
import com.huysor.crm.projectcrm.services.CustomerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerImpl implements CustomerServices {
    private final CustomerRepo customerRepo;
    @Override
    public Customers create(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public Customers update(Integer id, CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public Customers delete(Integer id) {
        return null;
    }

    @Override
    public Customers findById(Integer id) {
        return null;
    }

    @Override
    public List<Customers> findAll() {
        return List.of();
    }
}
