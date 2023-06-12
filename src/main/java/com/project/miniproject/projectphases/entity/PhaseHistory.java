package com.project.miniproject.projectphases.entity;
import javax.persistence.*;
@Entity
@Table(name = "Phase_history")
public class PhaseHistory {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "freelancer_id")
    private int freelancerId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "project_id")
    private int projectId;

    @Column(name = "phase_catalog_id")
    private int phaseCatalogId;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @Column(name = "comment")
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFreelancerId() {
        return freelancerId;
    }

    public void setFreelancerId(int freelancerId) {
        this.freelancerId = freelancerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
