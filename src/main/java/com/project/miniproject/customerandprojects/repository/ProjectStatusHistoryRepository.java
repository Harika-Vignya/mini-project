package com.project.miniproject.customerandprojects.repository;

import com.project.miniproject.customerandprojects.entity.ProjectStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectStatusHistoryRepository extends JpaRepository<ProjectStatusHistory, Integer> {
}
