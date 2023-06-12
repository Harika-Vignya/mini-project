package com.project.miniproject.teams.entity;

import javax.persistence.*;

@Entity
@Table(name = "in_charge")
public class InCharge {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "team_id")
    private int teamId;

    @Column(name = "phase_plan_id")
    private int phasePlanId;

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

    public int getPhasePlanId() {
        return phasePlanId;
    }

    public void setPhasePlanId(int phasePlanId) {
        this.phasePlanId = phasePlanId;
    }
}
