package com.project.miniproject.freelancer.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.miniproject.freelancer.entity.Availability;

public interface AvailabilityRepository extends JpaRepository<Availability, Integer> {

}