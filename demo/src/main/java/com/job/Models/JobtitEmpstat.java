package com.job.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobtit_empstat")
public class JobtitEmpstat {

    @Id
    @Column(name = "jobtit_code", nullable = false)
    private String jobtitCode;

    @Column(name = "estat_code", nullable = false)
    private String estatCode;

    // Getters and Setters
    public String getJobtitCode() {
        return jobtitCode;
    }

    public void setJobtitCode(String jobtitCode) {
        this.jobtitCode = jobtitCode;
    }

    public String getEstatCode() {
        return estatCode;
    }

    public void setEstatCode(String estatCode) {
        this.estatCode = estatCode;
    }
}
