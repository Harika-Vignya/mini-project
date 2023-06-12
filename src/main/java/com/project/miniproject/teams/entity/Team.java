package com.project.miniproject.teams.entity;
import javax.persistence.*;

@Entity
@Table(name = "team")
public class Team {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
