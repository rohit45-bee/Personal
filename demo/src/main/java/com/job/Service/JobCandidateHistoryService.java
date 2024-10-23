package com.job.Service;


import com.job.Models.JobCandidateHistory;

import java.util.List;
import java.util.Optional;

public interface JobCandidateHistoryService {
    JobCandidateHistory save(JobCandidateHistory jobCandidateHistory);

    Optional<JobCandidateHistory> findById(Long id);

    List<JobCandidateHistory> findAll();

    void deleteById(Long id);
}
