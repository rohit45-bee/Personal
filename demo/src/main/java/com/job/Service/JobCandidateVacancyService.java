package com.job.Service;


import com.job.Models.JobCandidateVacancy;

import java.util.List;
import java.util.Optional;

public interface JobCandidateVacancyService {
    JobCandidateVacancy save(JobCandidateVacancy jobCandidateVacancy);

    Optional<JobCandidateVacancy> findById(Long id);

    List<JobCandidateVacancy> findAll();

    void deleteById(Long id);
}
