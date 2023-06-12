package com.project.miniproject.projectphases.repository;
import com.project.miniproject.projectphases.entity.PhaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhaseHistoryRepository extends JpaRepository<PhaseHistory, Integer> {
}
