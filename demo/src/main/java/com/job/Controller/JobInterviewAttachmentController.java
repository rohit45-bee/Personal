package com.job.Controller;


import com.job.Models.JobInterviewAttachment;
import com.job.Service.JobInterviewAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-interview-attachment")
public class JobInterviewAttachmentController {

    @Autowired
    private JobInterviewAttachmentService jobInterviewAttachmentService;

    @PostMapping
    public ResponseEntity<JobInterviewAttachment> create(@RequestBody JobInterviewAttachment jobInterviewAttachment) {
        JobInterviewAttachment savedAttachment = jobInterviewAttachmentService.save(jobInterviewAttachment);
        return new ResponseEntity<>(savedAttachment, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobInterviewAttachment> getById(@PathVariable Long id) {
        Optional<JobInterviewAttachment> attachment = jobInterviewAttachmentService.findById(id);
        return attachment.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<JobInterviewAttachment>> getAll() {
        List<JobInterviewAttachment> attachments = jobInterviewAttachmentService.findAll();
        return ResponseEntity.ok(attachments);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobInterviewAttachment> update(@PathVariable Long id, @RequestBody JobInterviewAttachment jobInterviewAttachment) {
        Optional<JobInterviewAttachment> existingAttachment = jobInterviewAttachmentService.findById(id);
        if (existingAttachment.isPresent()) {
            JobInterviewAttachment updatedAttachment = existingAttachment.get();
            updatedAttachment.setInterviewId(jobInterviewAttachment.getInterviewId());
            updatedAttachment.setFileName(jobInterviewAttachment.getFileName());
            updatedAttachment.setFileType(jobInterviewAttachment.getFileType());
            updatedAttachment.setFileSize(jobInterviewAttachment.getFileSize());
            updatedAttachment.setFileContent(jobInterviewAttachment.getFileContent());
            updatedAttachment.setAttachmentType(jobInterviewAttachment.getAttachmentType());
            updatedAttachment.setComment(jobInterviewAttachment.getComment());
            JobInterviewAttachment savedAttachment = jobInterviewAttachmentService.save(updatedAttachment);
            return ResponseEntity.ok(savedAttachment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        jobInterviewAttachmentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
