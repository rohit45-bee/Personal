package com.job.Service;


import com.job.Models.JobVacancy;

import java.util.List;
import java.util.Optional;

public interface JobVacancyService {

    JobVacancy save(JobVacancy jobVacancy);

    Optional<JobVacancy> findById(Long id);

    List<JobVacancy> findAll();

    void deleteById(Long id);
}
