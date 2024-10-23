package com.job.Models;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "job_interview")
public class JobInterview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long candidateVacancyId;
    private Long candidateId;
    private String interviewName;
    private LocalDate interviewDate;
    private LocalTime interviewTime;
    private String note;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCandidateVacancyId() {
        return candidateVacancyId;
    }

    public void setCandidateVacancyId(Long candidateVacancyId) {
        this.candidateVacancyId = candidateVacancyId;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public String getInterviewName() {
        return interviewName;
    }

    public void setInterviewName(String interviewName) {
        this.interviewName = interviewName;
    }

    public LocalDate getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(LocalDate interviewDate) {
        this.interviewDate = interviewDate;
    }

    public LocalTime getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(LocalTime interviewTime) {
        this.interviewTime = interviewTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // Constructors
    public JobInterview() {
    }

    public JobInterview(Long id, Long candidateVacancyId, Long candidateId, String interviewName, LocalDate interviewDate, LocalTime interviewTime, String note) {
        this.id = id;
        this.candidateVacancyId = candidateVacancyId;
        this.candidateId = candidateId;
        this.interviewName = interviewName;
        this.interviewDate = interviewDate;
        this.interviewTime = interviewTime;
        this.note = note;
    }
}
