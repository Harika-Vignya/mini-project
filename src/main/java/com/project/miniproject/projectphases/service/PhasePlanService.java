package com.project.miniproject.projectphases.service;
import com.project.miniproject.projectphases.entity.PhasePlan;
import com.project.miniproject.projectphases.repository.PhasePlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhasePlanService implements IPhasePlanService {
    @Autowired
    private PhasePlanRepository phasePlanRepository;

    @Override
    public PhasePlan getPhasePlanById(int id) {
        return phasePlanRepository.getReferenceById(id);
    }
}

