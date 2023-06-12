package com.project.miniproject.teams.entity;

import javax.persistence.*;

@Entity
@Table(name = "on_project")
public class OnProject {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "team_id")
    private int teamId;

    @Column(name = "project_id")
    private int projectId;


}
