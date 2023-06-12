package com.project.miniproject.freelancer.service;
import com.project.miniproject.freelancer.entity.Skill;
import com.project.miniproject.freelancer.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    @Autowired
    private SkillRepository skillRepository;
    @Override
    public Skill getSkillById(int id) {return skillRepository.getReferenceById(id);}
}
