package com.project.miniproject.projectphases.entity;
import javax.persistence.*;
@Entity
@Table(name = "phase_plan")
public class PhasePlan {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "project_id")
    private int projectId;

    @Column(name = "phase_catalog_id")
    private int phaseCatalogId;

    @Column(name = "start_time_planned")
    private String startTimePlanned;

    @Column(name = "end_time_planned")
    private String endTimePlanned;

    @Column(name = "freelancer_id")
    private int freelancerId;

    @Column(name = "comment")
    private String comment;

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

    public int getPhaseCatalogId() {
        return phaseCatalogId;
    }

    public void setPhaseCatalogId(int phaseCatalogId) {
        this.phaseCatalogId = phaseCatalogId;
    }

    public String getStartTimePlanned() {
        return startTimePlanned;
    }

    public void setStartTimePlanned(String startTimePlanned) {
        this.startTimePlanned = startTimePlanned;
    }

    public String getEndTimePlanned() {
        return endTimePlanned;
    }

    public void setEndTimePlanned(String endTimePlanned) {
        this.endTimePlanned = endTimePlanned;
    }

    public int getFreelancerId() {
        return freelancerId;
    }

    public void setFreelancerId(int freelancerId) {
        this.freelancerId = freelancerId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
