package com.job.Models;


import jakarta.persistence.*;

@Entity
@Table(name = "job_category")
public class JobCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructors
    public JobCategory() {
    }

    public JobCategory(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
