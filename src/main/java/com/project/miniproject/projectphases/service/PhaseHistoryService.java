package com.project.miniproject.projectphases.service;

import com.project.miniproject.projectphases.entity.PhaseCatalog;
import com.project.miniproject.projectphases.entity.PhaseHistory;
import com.project.miniproject.projectphases.repository.PhaseCatalogRepository;
import com.project.miniproject.projectphases.repository.PhaseHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhaseHistoryService implements IPhaseHistoryService{
    @Autowired
    private PhaseHistoryRepository phaseHistoryRepository;
    @Override
    public PhaseHistory getPhaseHistoryServiceById(int id) {
        return phaseHistoryRepository.getReferenceById(id);
    }
}
