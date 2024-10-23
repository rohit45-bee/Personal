package com.job.Controller;


import com.job.Models.JobSpecificationAttachment;
import com.job.Service.JobSpecificationAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job-specification-attachments")
public class JobSpecificationAttachmentController {

    @Autowired
    private JobSpecificationAttachmentService jobSpecificationAttachmentService;

    @PostMapping
    public ResponseEntity<JobSpecificationAttachment> createJobSpecificationAttachment(@RequestBody JobSpecificationAttachment jobSpecificationAttachment) {
        return ResponseEntity.ok(jobSpecificationAttachmentService.createJobSpecificationAttachment(jobSpecificationAttachment));
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobSpecificationAttachment> updateJobSpecificationAttachment(@PathVariable Long id, @RequestBody JobSpecificationAttachment jobSpecificationAttachment) {
        return ResponseEntity.ok(jobSpecificationAttachmentService.updateJobSpecificationAttachment(id, jobSpecificationAttachment));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobSpecificationAttachment(@PathVariable Long id) {
        jobSpecificationAttachmentService.deleteJobSpecificationAttachment(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobSpecificationAttachment> getJobSpecificationAttachmentById(@PathVariable Long id) {
        return ResponseEntity.ok(jobSpecificationAttachmentService.getJobSpecificationAttachmentById(id));
    }

    @GetMapping
    public ResponseEntity<List<JobSpecificationAttachment>> getAllJobSpecificationAttachments() {
        return ResponseEntity.ok(jobSpecificationAttachmentService.getAllJobSpecificationAttachments());
    }
}
