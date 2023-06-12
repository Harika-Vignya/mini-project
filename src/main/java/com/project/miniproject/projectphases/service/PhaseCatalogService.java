package com.project.miniproject.projectphases.service;

import com.project.miniproject.projectphases.entity.PhaseCatalog;
import com.project.miniproject.projectphases.repository.PhaseCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhaseCatalogService implements IPhaseCatalogService {
    @Autowired
    private PhaseCatalogRepository phaseCatalogRepository;

    @Override
    public PhaseCatalog getPhaseCatalogById(int id) {
        return phaseCatalogRepository.getReferenceById(id);
    }
}
