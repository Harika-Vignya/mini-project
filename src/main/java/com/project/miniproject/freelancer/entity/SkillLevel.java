package com.project.miniproject.freelancer.entity;
import javax.persistence.*;
@Entity
@Table(name = "skill_level")
public class SkillLevel {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "level")
    private String level;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getLevel() {return level;}

    public void setLevel(String level) {this.level = level;}
}
