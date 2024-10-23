package com.job.Service;


import com.job.Models.JobTitle;
import com.job.Repository.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleServiceImpl implements JobTitleService {

    @Autowired
    private JobTitleRepository jobTitleRepository;

    @Override
    public JobTitle save(JobTitle jobTitle) {
        return jobTitleRepository.save(jobTitle);
    }



    @Override
    public Optional<JobTitle> findById(Long id) {
        return jobTitleRepository.findById(id);
    }

    @Override
    public List<JobTitle> findAll() {
        return jobTitleRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        jobTitleRepository.deleteById(id);
    }
}
