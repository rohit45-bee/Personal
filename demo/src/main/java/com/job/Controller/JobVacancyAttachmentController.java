package com.job.Controller;

import com.job.Models.JobVacancyAttachment;
import com.job.Service.JobVacancyAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job-vacancy-attachments")
public class JobVacancyAttachmentController {

    @Autowired
    private JobVacancyAttachmentService jobVacancyAttachmentService;

    @PostMapping
    public ResponseEntity<JobVacancyAttachment> create(@RequestBody JobVacancyAttachment jobVacancyAttachment) {
        return ResponseEntity.ok(jobVacancyAttachmentService.save(jobVacancyAttachment));
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobVacancyAttachment> update(@PathVariable Long id, @RequestBody JobVacancyAttachment jobVacancyAttachment) {
        return ResponseEntity.ok(jobVacancyAttachmentService.update(id, jobVacancyAttachment));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        jobVacancyAttachmentService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobVacancyAttachment> getById(@PathVariable Long id) {
        return ResponseEntity.ok(jobVacancyAttachmentService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<JobVacancyAttachment>> getAll() {
        return ResponseEntity.ok(jobVacancyAttachmentService.findAll());
    }
}
