package com.project.miniproject.customerandprojects.service;
import com.project.miniproject.customerandprojects.entity.ProjectStatusHistory;
import com.project.miniproject.customerandprojects.repository.ProjectStatusHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectStatusHistoryService implements IProjectStatusHistoryService{
    @Autowired
    private ProjectStatusHistoryRepository projectStatusHistoryRepository;
    @Override
    public ProjectStatusHistory getIProjectStatusHistoryById(int id) {
        return projectStatusHistoryRepository.getReferenceById(id);
    }
}
