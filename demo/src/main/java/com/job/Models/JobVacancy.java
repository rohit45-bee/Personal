package com.job.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "job_vacancy")
public class JobVacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "job_title_code", nullable = false)
    private String jobTitleCode;

    @Column(name = "hiring_manager_id", nullable = false)
    private Long hiringManagerId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "no_of_positions")
    private int noOfPositions;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "published_in_feed", nullable = false)
    private boolean publishedInFeed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitleCode() {
        return jobTitleCode;
    }

    public void setJobTitleCode(String jobTitleCode) {
        this.jobTitleCode = jobTitleCode;
    }

    public Long getHiringManagerId() {
        return hiringManagerId;
    }

    public void setHiringManagerId(Long hiringManagerId) {
        this.hiringManagerId = hiringManagerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfPositions() {
        return noOfPositions;
    }

    public void setNoOfPositions(int noOfPositions) {
        this.noOfPositions = noOfPositions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPublishedInFeed() {
        return publishedInFeed;
    }

    public void setPublishedInFeed(boolean publishedInFeed) {
        this.publishedInFeed = publishedInFeed;
    }

    public LocalDateTime getDefinedTime() {
        return definedTime;
    }

    public void setDefinedTime(LocalDateTime definedTime) {
        this.definedTime = definedTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Column(name = "defined_time", nullable = false)
    private LocalDateTime definedTime;

    @Column(name = "updated_time", nullable = false)
    private LocalDateTime updatedTime;

    public boolean getpublishedInFeed() {
        return false;
    }

    // Getters and setters
}
