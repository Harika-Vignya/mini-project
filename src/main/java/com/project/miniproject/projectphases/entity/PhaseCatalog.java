package com.project.miniproject.projectphases.entity;
import javax.persistence.*;
@Entity
@Table(name = "Phase_catalog")
public class PhaseCatalog {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "project_outcome_id")
    private int projectOutcomeId;

    @Column(name = "phase_catalog_name")
    private String phaseCatalogName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectOutcomeId() {
        return projectOutcomeId;
    }

    public void setProjectOutcomeId(int projectOutcomeId) {
        this.projectOutcomeId = projectOutcomeId;
    }

    public String getPhaseCatalogName() {
        return phaseCatalogName;
    }

    public void setPhaseCatalogName(String phaseCatalogName) {
        this.phaseCatalogName = phaseCatalogName;
    }
}