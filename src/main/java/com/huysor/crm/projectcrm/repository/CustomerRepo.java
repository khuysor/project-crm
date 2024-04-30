package com.huysor.crm.projectcrm.repository;

import com.huysor.crm.projectcrm.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customers,Long> {
}
