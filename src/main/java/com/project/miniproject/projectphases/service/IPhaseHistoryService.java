package com.project.miniproject.projectphases.service;

import com.project.miniproject.projectphases.entity.PhaseHistory;
import com.project.miniproject.projectphases.repository.PhaseCatalogRepository;

public interface IPhaseHistoryService {
    PhaseHistory getPhaseHistoryServiceById(int id);

}
