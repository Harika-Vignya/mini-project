package com.project.miniproject.teams.repository;

import com.project.miniproject.teams.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
