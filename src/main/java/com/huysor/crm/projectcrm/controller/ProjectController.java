package com.huysor.crm.projectcrm.controller;

import com.huysor.crm.projectcrm.dto.ProjectDTO;
import com.huysor.crm.projectcrm.services.ProjectServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/projects")

public class ProjectController {
    @Autowired
    private  ProjectServices projectServices;
    @PostMapping
    public ResponseEntity<?>create(@RequestBody ProjectDTO projectDTO){
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(projectServices.createProject(projectDTO));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
