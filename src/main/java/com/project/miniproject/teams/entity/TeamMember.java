package com.project.miniproject.teams.entity;

import javax.persistence.*;

@Entity
@Table(name = "team_member")
public class TeamMember {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "team_id")
    private int teamId;

    @Column(name = "freelancer_id")
    private int FreelancerId;

    @Column(name = "hours_worked")
    private String hoursWorked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getFreelancerId() {
        return FreelancerId;
    }

    public void setFreelancerId(int freelancerId) {
        FreelancerId = freelancerId;
    }

    public String getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
