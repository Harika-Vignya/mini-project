package com.project.miniproject.teams.service;

import com.project.miniproject.teams.entity.Team;
import com.project.miniproject.teams.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TeamService implements ITeamService{
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Team getTeamById(int id) {
        return teamRepository.getReferenceById(id);
    }
}
