package com.project.miniproject.freelancer.entity;

import javax.persistence.*;
@Entity

@Table(name = "availability")
public class Availability {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "availability_name")
    private String availabilityName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvailabilityName() {
        return availabilityName;
    }

    public void setAvailabilityName(String availabilityName) {
        this.availabilityName = availabilityName;
    }
}
