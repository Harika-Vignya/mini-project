package com.project.miniproject.customerandprojects.entity;
import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "description")
    private String description;

    @Column(name = "budget_plan")
    private float budgetPlan;

    @Column(name = "budget_estimate")
    private float budgetEstimate;

    @Column(name = "budget_actual")
    private float budgetActual;

    @Column(name = "amount_paid")
    private float amountPaid;

    @Column(name = "project_outcome_id")
    private int projectOutcomeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBudgetPlan() {
        return budgetPlan;
    }

    public void setBudgetPlan(float budgetPlan) {
        this.budgetPlan = budgetPlan;
    }

    public float getBudgetEstimate() {
        return budgetEstimate;
    }

    public void setBudgetEstimate(float budgetEstimate) {
        this.budgetEstimate = budgetEstimate;
    }

    public float getBudgetActual() {
        return budgetActual;
    }

    public void setBudgetActual(float budgetActual) {
        this.budgetActual = budgetActual;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getProjectOutcomeId() {
        return projectOutcomeId;
    }

    public void setProjectOutcomeId(int projectOutcomeId) {
        this.projectOutcomeId = projectOutcomeId;
    }
}
