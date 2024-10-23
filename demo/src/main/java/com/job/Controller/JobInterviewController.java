package com.job.Controller;


import com.job.Models.JobInterview;
import com.job.Service.JobInterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-interview")
public class JobInterviewController {

    @Autowired
    private JobInterviewService jobInterviewService;

    @PostMapping
    public ResponseEntity<JobInterview> create(@RequestBody JobInterview jobInterview) {
        JobInterview savedInterview = jobInterviewService.save(jobInterview);
        return new ResponseEntity<>(savedInterview, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobInterview> getById(@PathVariable Long id) {
        Optional<JobInterview> interview = jobInterviewService.findById(id);
        return interview.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<JobInterview>> getAll() {
        List<JobInterview> interviews = jobInterviewService.findAll();
        return ResponseEntity.ok(interviews);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobInterview> update(@PathVariable Long id, @RequestBody JobInterview jobInterview) {
        Optional<JobInterview> existingInterview = jobInterviewService.findById(id);
        if (existingInterview.isPresent()) {
            JobInterview updatedInterview = existingInterview.get();
            updatedInterview.setCandidateVacancyId(jobInterview.getCandidateVacancyId());
            updatedInterview.setCandidateId(jobInterview.getCandidateId());
            updatedInterview.setInterviewName(jobInterview.getInterviewName());
            updatedInterview.setInterviewDate(jobInterview.getInterviewDate());
            updatedInterview.setInterviewTime(jobInterview.getInterviewTime());
            updatedInterview.setNote(jobInterview.getNote());
            JobInterview savedInterview = jobInterviewService.save(updatedInterview);
            return ResponseEntity.ok(savedInterview);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        jobInterviewService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
