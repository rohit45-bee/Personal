package com.job.Controller;


import com.job.Models.JobCandidateHistory;
import com.job.Service.JobCandidateHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-candidate-history")
public class JobCandidateHistoryController {

    @Autowired
    private JobCandidateHistoryService jobCandidateHistoryService;

    @PostMapping
    public ResponseEntity<JobCandidateHistory> create(@RequestBody JobCandidateHistory jobCandidateHistory) {
        JobCandidateHistory savedHistory = jobCandidateHistoryService.save(jobCandidateHistory);
        return new ResponseEntity<>(savedHistory, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobCandidateHistory> getById(@PathVariable Long id) {
        Optional<JobCandidateHistory> history = jobCandidateHistoryService.findById(id);
        return history.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<JobCandidateHistory>> getAll() {
        List<JobCandidateHistory> histories = jobCandidateHistoryService.findAll();
        return ResponseEntity.ok(histories);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobCandidateHistory> update(@PathVariable Long id, @RequestBody JobCandidateHistory jobCandidateHistory) {
        Optional<JobCandidateHistory> existingHistory = jobCandidateHistoryService.findById(id);
        if (existingHistory.isPresent()) {
            JobCandidateHistory updatedHistory = existingHistory.get();
            updatedHistory.setCandidateId(jobCandidateHistory.getCandidateId());
            updatedHistory.setVacancyId(jobCandidateHistory.getVacancyId());
            updatedHistory.setCandidateVacancyName(jobCandidateHistory.getCandidateVacancyName());
            updatedHistory.setInterviewId(jobCandidateHistory.getInterviewId());
            updatedHistory.setAction(jobCandidateHistory.getAction());
            updatedHistory.setPerformedBy(jobCandidateHistory.getPerformedBy());
            updatedHistory.setPerformedDate(jobCandidateHistory.getPerformedDate());
            updatedHistory.setNote(jobCandidateHistory.getNote());
            updatedHistory.setInterviewers(jobCandidateHistory.getInterviewers());
            JobCandidateHistory savedHistory = jobCandidateHistoryService.save(updatedHistory);
            return ResponseEntity.ok(savedHistory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        jobCandidateHistoryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
