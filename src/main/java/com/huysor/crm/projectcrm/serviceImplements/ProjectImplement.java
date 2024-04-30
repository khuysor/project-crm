package com.huysor.crm.projectcrm.serviceImplements;

import com.huysor.crm.projectcrm.dto.ProjectDTO;
import com.huysor.crm.projectcrm.entity.Projects;
import com.huysor.crm.projectcrm.mapper.ProjectMapping;
import com.huysor.crm.projectcrm.repository.ProjectRepo;
import com.huysor.crm.projectcrm.services.ProjectServices;
import com.huysor.crm.projectcrm.utils.MessageRespone;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class ProjectImplement implements ProjectServices {
    @Autowired
    private  ProjectRepo projectRepo;

    @Override
    public Projects createProject(ProjectDTO projectDTO) {
        return projectRepo.save(ProjectMapping.INSTANCE.toProjects(projectDTO));
    }

    @Override
    public Projects updateProject(ProjectDTO projectDTO) {
        return null;
    }

    @Override
    public Projects deleteProject(Integer id) {
        return null;
    }

    @Override
    public Projects findById(Integer id) {
        return null;
    }

    @Override
    public List<Projects> findAll() {
        return List.of();
    }
}
