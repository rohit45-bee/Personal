package com.job.Controller;


import com.job.Models.JobTitle;
import com.job.Service.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-title")
public class JobTitleController {

    @Autowired
    private JobTitleService jobTitleService;

    @PostMapping
    public ResponseEntity<JobTitle> create(@RequestBody JobTitle jobTitle) {
        JobTitle savedJobTitle = jobTitleService.save(jobTitle);
        return new ResponseEntity<>(savedJobTitle, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobTitle> getById(@PathVariable Long id) {
        Optional<JobTitle> jobTitle = jobTitleService.findById(id);
        return jobTitle.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<JobTitle>> getAll() {
        List<JobTitle> jobTitles = jobTitleService.findAll();
        return ResponseEntity.ok(jobTitles);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobTitle> update(@PathVariable Long id, @RequestBody JobTitle jobTitle) {
        Optional<JobTitle> existingJobTitle = jobTitleService.findById(id);
        if (existingJobTitle.isPresent()) {
            JobTitle updatedJobTitle = existingJobTitle.get();
            updatedJobTitle.setJobTitle(jobTitle.getJobTitle());
            updatedJobTitle.setJobDescription(jobTitle.getJobDescription());
            updatedJobTitle.setNote(jobTitle.getNote());
            updatedJobTitle.setIsDeleted(jobTitle.getIsDeleted());
            JobTitle savedJobTitle = jobTitleService.save(updatedJobTitle);
            return ResponseEntity.ok(savedJobTitle);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        jobTitleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
