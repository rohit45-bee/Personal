package com.job.Models;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "job_candidate_history")
public class JobCandidateHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "candidate_id")
    private Long candidateId;

    @Column(name = "vacancy_id")
    private Long vacancyId;

    @Column(name = "candidate_vacancy_name")
    private String candidateVacancyName;

    @Column(name = "interview_id")
    private Long interviewId;

    @Column(name = "action")
    private String action;

    @Column(name = "performed_by")
    private String performedBy;

    @Column(name = "performed_date")
    private LocalDateTime performedDate;

    @Column(name = "note")
    private String note;

    @Column(name = "interviewers")
    private String interviewers;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public Long getVacancyId() {
        return vacancyId;
    }

    public void setVacancyId(Long vacancyId) {
        this.vacancyId = vacancyId;
    }

    public String getCandidateVacancyName() {
        return candidateVacancyName;
    }

    public void setCandidateVacancyName(String candidateVacancyName) {
        this.candidateVacancyName = candidateVacancyName;
    }

    public Long getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Long interviewId) {
        this.interviewId = interviewId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public LocalDateTime getPerformedDate() {
        return performedDate;
    }

    public void setPerformedDate(LocalDateTime performedDate) {
        this.performedDate = performedDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getInterviewers() {
        return interviewers;
    }

    public void setInterviewers(String interviewers) {
        this.interviewers = interviewers;
    }
}
