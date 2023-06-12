package com.project.miniproject.customerandprojects.service;
import com.project.miniproject.customerandprojects.entity.ProjectStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectStatusHistoryService  {

    ProjectStatusHistory getIProjectStatusHistoryById(int id);
}
