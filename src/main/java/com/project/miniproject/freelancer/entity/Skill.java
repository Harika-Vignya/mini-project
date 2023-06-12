package com.project.miniproject.freelancer.entity;
import javax.persistence.*;
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "skill_name")
    private String skillName;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getSkillName() {return skillName;}

    public void setSkillName(String skillName) {this.skillName = skillName;}
}
