package com.project.miniproject.customerandprojects.service;

import com.project.miniproject.customerandprojects.entity.ProjectOutcome;
import com.project.miniproject.customerandprojects.repository.ProjectOutcomeRepository;
public interface IProjectOutcomeService {
    ProjectOutcome getIProjectOutcomeById(int id);
}
