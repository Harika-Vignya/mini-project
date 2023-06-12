package com.project.miniproject.customerandprojects.service;

import com.project.miniproject.customerandprojects.entity.ProjectOutcome;
import com.project.miniproject.customerandprojects.repository.ProjectOutcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectOutcomeService implements IProjectOutcomeService {
    @Autowired
    private ProjectOutcomeRepository projectOutcomeRepository;


    @Override
    public ProjectOutcome getIProjectOutcomeById(int id) {
        return projectOutcomeRepository.getReferenceById(id);
    }
}