package com.project.miniproject.freelancer.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.project.miniproject.freelancer.entity.Availability;
import com.project.miniproject.freelancer.repository.AvailabilityRepository;
import org.springframework.stereotype.Service;

@Service
public class AvailabilityService implements IAvailabilityService {

    @Autowired
    private AvailabilityRepository availabilityRepository;

    @Override
    public Availability getAvailabilityById(int id) {
        return availabilityRepository.getReferenceById(id);
    }

}

