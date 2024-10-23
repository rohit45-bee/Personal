package com.job.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "job_interview_interviewer")
public class JobInterviewInterviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interviewId;

    @Column(name = "interviewer_id")
    private Long interviewerId;

    // Getters and Setters
    public Long getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Long interviewId) {
        this.interviewId = interviewId;
    }

    public Long getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(Long interviewerId) {
        this.interviewerId = interviewerId;
    }
}
