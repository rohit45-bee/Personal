package com.job.Service;


import com.job.Models.JobInterview;
import com.job.Repository.JobInterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobInterviewServiceImpl implements JobInterviewService {

    @Autowired
    private JobInterviewRepository jobInterviewRepository;

    @Override
    public JobInterview save(JobInterview jobInterview) {
        return jobInterviewRepository.save(jobInterview);
    }



    @Override
    public Optional<JobInterview> findById(Long id) {
        return jobInterviewRepository.findById(id);
    }

    @Override
    public List<JobInterview> findAll() {
        return jobInterviewRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        jobInterviewRepository.deleteById(id);
    }
}
