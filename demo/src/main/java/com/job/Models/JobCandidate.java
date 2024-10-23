package com.job.Models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "job_candidates")
public class JobCandidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "status")
    private String status;

    @Column(name = "comment")
    private String comment;

    @Column(name = "mode_of_application")
    private String modeOfApplication;

    @Column(name = "date_of_application")
    @Temporal(TemporalType.DATE)
    private Date dateOfApplication;

    @Column(name = "cv_file_id")
    private String cvFileId;

    @Column(name = "cv_text_version")
    private String cvTextVersion;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "added_person")
    private String addedPerson;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getModeOfApplication() {
        return modeOfApplication;
    }

    public void setModeOfApplication(String modeOfApplication) {
        this.modeOfApplication = modeOfApplication;
    }

    public Date getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(Date dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    public String getCvFileId() {
        return cvFileId;
    }

    public void setCvFileId(String cvFileId) {
        this.cvFileId = cvFileId;
    }

    public String getCvTextVersion() {
        return cvTextVersion;
    }

    public void setCvTextVersion(String cvTextVersion) {
        this.cvTextVersion = cvTextVersion;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getAddedPerson() {
        return addedPerson;
    }

    public void setAddedPerson(String addedPerson) {
        this.addedPerson = addedPerson;
    }

    // toString(), equals(), and hashCode() methods if needed
}
