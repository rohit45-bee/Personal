package com.job.Service;


import com.job.Models.JobCandidateHistory;
import com.job.Repository.JobCandidateHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobCandidateHistoryServiceImpl implements JobCandidateHistoryService {

    @Autowired
    private JobCandidateHistoryRepository repository;

    @Override
    public JobCandidateHistory save(JobCandidateHistory jobCandidateHistory) {
        return repository.save(jobCandidateHistory);
    }




    @Override
    public Optional<JobCandidateHistory> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<JobCandidateHistory> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
