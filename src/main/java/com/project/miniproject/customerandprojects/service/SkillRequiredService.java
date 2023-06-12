package com.project.miniproject.customerandprojects.service;

import com.project.miniproject.customerandprojects.entity.SkillRequired;
import com.project.miniproject.customerandprojects.repository.SkillRequiredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillRequiredService implements ISkillRequiredService {

    @Autowired
    private SkillRequiredRepository skillRequiredRepository;

    @Override
    public SkillRequired getSkillRequiredById(int id) {
        return skillRequiredRepository.getReferenceById(id);
    }

    }

