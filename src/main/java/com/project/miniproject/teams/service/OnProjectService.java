package com.project.miniproject.teams.service;

import com.project.miniproject.teams.entity.OnProject;
import com.project.miniproject.teams.repository.OnProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OnProjectService implements IOnProjectService{
    @Autowired
    private OnProjectRepository onProjectRepository;
    @Override
    public OnProject getOnProjectById(int id) {
        return onProjectRepository.getReferenceById(id);
    }
}
