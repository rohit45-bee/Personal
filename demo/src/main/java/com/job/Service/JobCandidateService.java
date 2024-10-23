package com.job.Service;


import com.job.Models.JobCandidate;

import java.util.List;
import java.util.Optional;

public interface JobCandidateService {
    JobCandidate saveJobCandidate(JobCandidate jobCandidate);
    Optional<JobCandidate> getJobCandidateById(Long id);
    List<JobCandidate> getAllJobCandidates();
    JobCandidate updateJobCandidate(Long id, JobCandidate jobCandidate);
    boolean deleteJobCandidateById(Long id);
}
