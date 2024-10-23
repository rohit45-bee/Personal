package com.job.Service;


import com.job.Models.JobCategory;

import java.util.List;
import java.util.Optional;

public interface JobCategoryService {

    JobCategory save(JobCategory jobCategory);

    Optional<JobCategory> findById(Long id);

    List<JobCategory> findAll();

    void deleteById(Long id);
}
