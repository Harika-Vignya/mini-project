package com.project.miniproject.customerandprojects.entity;
import javax.persistence.*;

@Entity
@Table(name = "projectStatusHistory")
public class ProjectStatusHistory {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "project_id")
    private int projectId;

    @Column(name = "project_outcome_id")
    private int projectOutcomeId;

    @Column(name = "details")
    private String details;

    @Column(name = "ts")
    private String timeStamp;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectOutcome() {
        return projectOutcomeId;
    }

    public void setProjectOutcome(int projectOutcomeId) {
        this.projectOutcomeId = projectOutcomeId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
