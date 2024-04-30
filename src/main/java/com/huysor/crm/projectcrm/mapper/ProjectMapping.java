package com.huysor.crm.projectcrm.mapper;

import com.huysor.crm.projectcrm.dto.ProjectDTO;
import com.huysor.crm.projectcrm.entity.Projects;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProjectMapping {
    ProjectMapping INSTANCE= Mappers.getMapper(ProjectMapping.class);
    Projects toProjects(ProjectDTO projectDTO) ;
    ProjectDTO toProjectDTO(Projects projects);
}
