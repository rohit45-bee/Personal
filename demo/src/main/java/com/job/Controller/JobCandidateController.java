package com.job.Controller;


import com.job.Models.JobCandidate;
import com.job.Service.JobCandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/job-candidates")
public class JobCandidateController {

    @Autowired
    private JobCandidateService jobCandidateService;

    @PostMapping
    public ResponseEntity<JobCandidate> createJobCandidate(@RequestBody JobCandidate jobCandidate) {
        JobCandidate savedJobCandidate = jobCandidateService.saveJobCandidate(jobCandidate);
        return ResponseEntity.ok(savedJobCandidate);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobCandidate> getJobCandidateById(@PathVariable Long id) {
        Optional<JobCandidate> jobCandidate = jobCandidateService.getJobCandidateById(id);
        return jobCandidate.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobCandidate> updateJobCandidateById(@PathVariable Long id, @RequestBody JobCandidate jobCandidate) {
        Optional<JobCandidate> existingJobCandidateOpt = jobCandidateService.getJobCandidateById(id);

        if (existingJobCandidateOpt.isPresent()) {
            JobCandidate existingJobCandidate = existingJobCandidateOpt.get();

            // Check and update each field if it's not null
            if (jobCandidate.getFirstName() != null) {
                existingJobCandidate.setFirstName(jobCandidate.getFirstName());
            }
            if (jobCandidate.getMiddleName() != null) {
                existingJobCandidate.setMiddleName(jobCandidate.getMiddleName());
            }
            if (jobCandidate.getLastName() != null) {
                existingJobCandidate.setLastName(jobCandidate.getLastName());
            }
            if (jobCandidate.getEmail() != null) {
                existingJobCandidate.setEmail(jobCandidate.getEmail());
            }
            if (jobCandidate.getContactNumber() != null) {
                existingJobCandidate.setContactNumber(jobCandidate.getContactNumber());
            }
            if (jobCandidate.getStatus() != null) {
                existingJobCandidate.setStatus(jobCandidate.getStatus());
            }
            if (jobCandidate.getComment() != null) {
                existingJobCandidate.setComment(jobCandidate.getComment());
            }
            if (jobCandidate.getModeOfApplication() != null) {
                existingJobCandidate.setModeOfApplication(jobCandidate.getModeOfApplication());
            }
            if (jobCandidate.getDateOfApplication() != null) {
                existingJobCandidate.setDateOfApplication(jobCandidate.getDateOfApplication());
            }
            if (jobCandidate.getCvFileId() != null) {
                existingJobCandidate.setCvFileId(jobCandidate.getCvFileId());
            }
            if (jobCandidate.getCvTextVersion() != null) {
                existingJobCandidate.setCvTextVersion(jobCandidate.getCvTextVersion());
            }
            if (jobCandidate.getKeywords() != null) {
                existingJobCandidate.setKeywords(jobCandidate.getKeywords());
            }
            if (jobCandidate.getAddedPerson() != null) {
                existingJobCandidate.setAddedPerson(jobCandidate.getAddedPerson());
            }

            JobCandidate updatedJobCandidate = jobCandidateService.saveJobCandidate(existingJobCandidate);
            return ResponseEntity.ok(updatedJobCandidate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobCandidateById(@PathVariable Long id) {
        if (jobCandidateService.deleteJobCandidateById(id)) {
            return ResponseEntity.ok("Job candidate record deleted successfully.");
        }
        return ResponseEntity.notFound().build();
    }
}
