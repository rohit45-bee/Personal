package com.job.Service;


import com.job.Models.JobInterview;

import java.util.List;
import java.util.Optional;

public interface JobInterviewService {

    JobInterview save(JobInterview jobInterview);

    Optional<JobInterview> findById(Long id);

    List<JobInterview> findAll();

    void deleteById(Long id);
}
