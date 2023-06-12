package com.project.miniproject.teams.repository;

import com.project.miniproject.teams.entity.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMemberRepository extends JpaRepository<TeamMember, Integer> {
}
