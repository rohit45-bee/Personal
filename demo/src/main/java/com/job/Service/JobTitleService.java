package com.job.Service;


import com.job.Models.JobTitle;

import java.util.List;
import java.util.Optional;

public interface JobTitleService {

    JobTitle save(JobTitle jobTitle);

    Optional<JobTitle> findById(Long id);

    List<JobTitle> findAll();

    void deleteById(Long id);
}
