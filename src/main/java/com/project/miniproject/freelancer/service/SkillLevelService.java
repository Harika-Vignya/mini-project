package com.project.miniproject.freelancer.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.miniproject.freelancer.entity.SkillLevel;
import com.project.miniproject.freelancer.repository.SkillLevelRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillLevelService implements ISkillLevelServices {
    @Autowired
    private SkillLevelRepository skillLevelRepository;
    @Override
    public SkillLevel getSkillLevelById(int id) {
        return skillLevelRepository.getReferenceById(id);
    }

}

