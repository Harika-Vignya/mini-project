package com.project.miniproject.customerandprojects.repository;
import com.project.miniproject.customerandprojects.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
