package com.project.miniproject.teams.service;

import com.project.miniproject.teams.entity.TeamMember;
import com.project.miniproject.teams.repository.TeamMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TeamMemberService implements ITeamMemberService{
    @Autowired
    private TeamMemberRepository teamMemberRepository;
    @Override
    public TeamMember getTeamMemberById(int id) {
        return teamMemberRepository.getReferenceById(id);
    }
}
