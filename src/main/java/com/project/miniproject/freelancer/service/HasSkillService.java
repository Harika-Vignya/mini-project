package com.project.miniproject.freelancer.service;
import com.project.miniproject.freelancer.entity.HasSkill;
import com.project.miniproject.freelancer.repository.HasSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HasSkillService implements IHasSkillService {
    @Autowired
    private HasSkillRepository hasSkillRepository;
    @Override
    public HasSkill getHasSkillById(int id) {return hasSkillRepository.getReferenceById(id);}
}


