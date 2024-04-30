package com.huysor.crm.projectcrm.services;

import com.huysor.crm.projectcrm.dto.ProjectDTO;
import com.huysor.crm.projectcrm.entity.Projects;

import java.util.List;

public interface ProjectServices {
    Projects createProject(ProjectDTO projectDTO);
    Projects updateProject(ProjectDTO projectDTO);
    Projects deleteProject(Integer id);
    Projects findById(Integer id);
    List<Projects> findAll();
}
