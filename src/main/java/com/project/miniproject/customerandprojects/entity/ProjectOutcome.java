package com.project.miniproject.customerandprojects.entity;
import javax.persistence.*;

@Entity
@Table(name = "projectOutcome")
public class ProjectOutcome {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "outcome_name")
    private String outcomeName;

    @Column(name = "ongoing")
    private boolean ongoing;

    @Column(name = "on_hold")
    private boolean onHold;

    @Column(name = "is_completed_successfully")
    private boolean isCompletedSuccessfully;

    @Column(name = "is_completed_unsuccessfully")
    private boolean isCompletedUnsuccessfully;


    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getOutcomeName() {return outcomeName;}

    public void setOutcomeName(String outcomeName) {this.outcomeName = outcomeName;}

    public boolean isOngoing() {return ongoing;}

    public void setOngoing(boolean ongoing) {this.ongoing = ongoing;}

    public boolean isOnHold() {return onHold;}

    public void setOnHold(boolean onHold) {this.onHold = onHold;}

    public boolean isCompletedSuccessfully() {return isCompletedSuccessfully;}

    public void setCompletedSuccessfully(boolean completedSuccessfully) {isCompletedSuccessfully = completedSuccessfully;}

    public boolean isCompletedUnsuccessfully() {return isCompletedUnsuccessfully;}

    public void setCompletedUnsuccessfully(boolean completedUnsuccessfully) {isCompletedUnsuccessfully = completedUnsuccessfully;}
}
