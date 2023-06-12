package com.project.miniproject.teams.service;

import com.project.miniproject.teams.entity.InCharge;
import com.project.miniproject.teams.repository.InChargeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InChargeService implements IInChargeService{
    @Autowired
    private InChargeRepository inChargeRepository;
    @Override
    public InCharge getInChargeById(int id) {
        return inChargeRepository.getReferenceById(id);
    }
}
