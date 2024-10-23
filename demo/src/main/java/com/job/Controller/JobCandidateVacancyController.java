package com.job.Controller;


import com.job.Models.JobCandidateVacancy;
import com.job.Service.JobCandidateVacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-candidate-vacancy")
public class JobCandidateVacancyController {

    @Autowired
    private JobCandidateVacancyService jobCandidateVacancyService;

    @PostMapping
    public ResponseEntity<JobCandidateVacancy> create(@RequestBody JobCandidateVacancy jobCandidateVacancy) {
        JobCandidateVacancy savedVacancy = jobCandidateVacancyService.save(jobCandidateVacancy);
        return new ResponseEntity<>(savedVacancy, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobCandidateVacancy> getById(@PathVariable Long id) {
        Optional<JobCandidateVacancy> vacancy = jobCandidateVacancyService.findById(id);
        return vacancy.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<JobCandidateVacancy>> getAll() {
        List<JobCandidateVacancy> vacancies = jobCandidateVacancyService.findAll();
        return ResponseEntity.ok(vacancies);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobCandidateVacancy> update(@PathVariable Long id, @RequestBody JobCandidateVacancy jobCandidateVacancy) {
        Optional<JobCandidateVacancy> existingVacancy = jobCandidateVacancyService.findById(id);
        if (existingVacancy.isPresent()) {
            JobCandidateVacancy updatedVacancy = existingVacancy.get();
            updatedVacancy.setCandidateId(jobCandidateVacancy.getCandidateId());
            updatedVacancy.setVacancyId(jobCandidateVacancy.getVacancyId());
            updatedVacancy.setStatus(jobCandidateVacancy.getStatus());
            updatedVacancy.setAppliedDate(jobCandidateVacancy.getAppliedDate());
            JobCandidateVacancy savedVacancy = jobCandidateVacancyService.save(updatedVacancy);
            return ResponseEntity.ok(savedVacancy);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        jobCandidateVacancyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
