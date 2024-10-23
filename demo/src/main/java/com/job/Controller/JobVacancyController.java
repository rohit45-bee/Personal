package com.job.Controller;


import com.job.Models.JobVacancy;
import com.job.Service.JobVacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-vacancy")
public class JobVacancyController {

    @Autowired
    private JobVacancyService jobVacancyService;

    @PostMapping
    public ResponseEntity<JobVacancy> create(@RequestBody JobVacancy jobVacancy) {
        JobVacancy savedJobVacancy = jobVacancyService.save(jobVacancy);
        return new ResponseEntity<>(savedJobVacancy, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobVacancy> getById(@PathVariable Long id) {
        Optional<JobVacancy> jobVacancy = jobVacancyService.findById(id);
        return jobVacancy.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<JobVacancy>> getAll() {
        List<JobVacancy> jobVacancies = jobVacancyService.findAll();
        return ResponseEntity.ok(jobVacancies);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobVacancy> update(@PathVariable Long id, @RequestBody JobVacancy jobVacancy) {
        Optional<JobVacancy> existingJobVacancy = jobVacancyService.findById(id);
        if (existingJobVacancy.isPresent()) {
            JobVacancy updatedJobVacancy = existingJobVacancy.get();
            updatedJobVacancy.setJobTitleCode(jobVacancy.getJobTitleCode());
            updatedJobVacancy.setHiringManagerId(jobVacancy.getHiringManagerId());
            updatedJobVacancy.setName(jobVacancy.getName());
            updatedJobVacancy.setDescription(jobVacancy.getDescription());
            updatedJobVacancy.setNoOfPositions(jobVacancy.getNoOfPositions());
            updatedJobVacancy.setStatus(jobVacancy.getStatus());
            updatedJobVacancy.setPublishedInFeed(jobVacancy.getpublishedInFeed());
            updatedJobVacancy.setDefinedTime(jobVacancy.getDefinedTime());
            updatedJobVacancy.setUpdatedTime(jobVacancy.getUpdatedTime());
            JobVacancy savedJobVacancy = jobVacancyService.save(updatedJobVacancy);
            return ResponseEntity.ok(savedJobVacancy);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        jobVacancyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
