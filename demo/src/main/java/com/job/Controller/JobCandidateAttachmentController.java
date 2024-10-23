package com.job.Controller;


import com.job.Models.JobCandidateAttachment;
import com.job.Service.JobCandidateAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-candidate-attachments")
public class JobCandidateAttachmentController {

    @Autowired
    private JobCandidateAttachmentService jobCandidateAttachmentService;

    @PostMapping
    public ResponseEntity<JobCandidateAttachment> createJobCandidateAttachment(@RequestBody JobCandidateAttachment jobCandidateAttachment) {
        JobCandidateAttachment savedAttachment = jobCandidateAttachmentService.saveJobCandidateAttachment(jobCandidateAttachment);
        return ResponseEntity.ok(savedAttachment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobCandidateAttachment> getJobCandidateAttachmentById(@PathVariable Long id) {
        Optional<JobCandidateAttachment> attachment = jobCandidateAttachmentService.getJobCandidateAttachmentById(id);
        return attachment.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<JobCandidateAttachment>> getAllJobCandidateAttachments() {
        List<JobCandidateAttachment> attachments = jobCandidateAttachmentService.getAllJobCandidateAttachments();
        return ResponseEntity.ok(attachments);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobCandidateAttachment> updateJobCandidateAttachmentById(@PathVariable Long id, @RequestBody JobCandidateAttachment jobCandidateAttachment) {
        JobCandidateAttachment updatedAttachment = jobCandidateAttachmentService.updateJobCandidateAttachment(id, jobCandidateAttachment);
        return updatedAttachment != null ? ResponseEntity.ok(updatedAttachment) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobCandidateAttachmentById(@PathVariable Long id) {
        boolean isDeleted = jobCandidateAttachmentService.deleteJobCandidateAttachmentById(id);
        return isDeleted ? ResponseEntity.ok("Attachment deleted successfully.") : ResponseEntity.notFound().build();
    }
}
