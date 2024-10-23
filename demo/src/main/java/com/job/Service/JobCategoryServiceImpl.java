package com.job.Service;


import com.job.Models.JobCategory;
import com.job.Repository.JobCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobCategoryServiceImpl implements JobCategoryService {

    @Autowired
    private JobCategoryRepository jobCategoryRepository;

    @Override
    public JobCategory save(JobCategory jobCategory) {
        return jobCategoryRepository.save(jobCategory);
    }


    @Override
    public Optional<JobCategory> findById(Long id) {
        return jobCategoryRepository.findById(id);
    }

    @Override
    public List<JobCategory> findAll() {
        return jobCategoryRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        jobCategoryRepository.deleteById(id);
    }
}
