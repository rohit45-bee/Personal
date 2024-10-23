package com.job.Service;


import com.job.Models.JobCandidateVacancy;
import com.job.Repository.JobCandidateVacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobCandidateVacancyServiceImpl implements JobCandidateVacancyService {

    @Autowired
    private JobCandidateVacancyRepository repository;

    @Override
    public JobCandidateVacancy save(JobCandidateVacancy jobCandidateVacancy) {
        return repository.save(jobCandidateVacancy);
    }



    @Override
    public Optional<JobCandidateVacancy> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<JobCandidateVacancy> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
