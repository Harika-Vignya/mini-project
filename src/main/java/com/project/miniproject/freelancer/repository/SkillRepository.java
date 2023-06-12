package com.project.miniproject.freelancer.repository;

import com.project.miniproject.freelancer.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
