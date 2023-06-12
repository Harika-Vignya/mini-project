package com.project.miniproject.freelancer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.miniproject.freelancer.entity.Freelancer;

public interface FreelancerRepository extends JpaRepository<Freelancer, Integer> {

}
