package com.huysor.crm.projectcrm.repository;

import com.huysor.crm.projectcrm.entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface ProjectRepo extends JpaRepository<Projects,Long> {
}
