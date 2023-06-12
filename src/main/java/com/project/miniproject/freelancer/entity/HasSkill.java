package com.project.miniproject.freelancer.entity;
import javax.persistence.*;
@Entity
@Table(name = "has_skill")
public class HasSkill {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "freelancer_id")
    private int freelancerId;

    @Column(name = "skill_id")
    private int skillId;

    @Column(name = "skill_level_id")
    private int skillLevelId;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getFreelancerId() {return freelancerId;}

    public void setFreelancerId(int freelancerId) {this.freelancerId = freelancerId;}

    public int getSkillId() {return skillId;}

    public void setSkillId(int skillId) {this.skillId = skillId;}

    public int getSkillLevelId() {return skillLevelId;}

    public void setSkillLevelId(int skillLevelId) {this.skillLevelId = skillLevelId;}
}
