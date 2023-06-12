package com.project.miniproject.customerandprojects.service;

import com.project.miniproject.customerandprojects.entity.Project;
import com.project.miniproject.customerandprojects.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project getIProjectById(int id) {
        return projectRepository.getReferenceById(id);
    }
}
