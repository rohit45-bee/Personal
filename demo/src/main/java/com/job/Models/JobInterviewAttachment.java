package com.job.Models;


import jakarta.persistence.*;

@Entity
@Table(name = "job_interview_attachment")
public class JobInterviewAttachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long interviewId;
    private String fileName;
    private String fileType;
    private Long fileSize;

    @Lob
    @Column(columnDefinition = "BLOB")
    private byte[] fileContent;

    private String attachmentType;
    private String comment;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Long interviewId) {
        this.interviewId = interviewId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Constructors
    public JobInterviewAttachment() {
    }

    public JobInterviewAttachment(Long id, Long interviewId, String fileName, String fileType, Long fileSize, byte[] fileContent, String attachmentType, String comment) {
        this.id = id;
        this.interviewId = interviewId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.fileContent = fileContent;
        this.attachmentType = attachmentType;
        this.comment = comment;
    }
}
