package com.job.Service;


import com.job.Models.JobVacancy;
import com.job.Repository.JobVacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobVacancyServiceImpl implements JobVacancyService {

    @Autowired
    private JobVacancyRepository jobVacancyRepository;

    @Override
    public JobVacancy save(JobVacancy jobVacancy) {
        return jobVacancyRepository.save(jobVacancy);
    }

    @Override
    public Optional<JobVacancy> findById(Long id) {
        return jobVacancyRepository.findById(id);
    }

    @Override
    public List<JobVacancy> findAll() {
        return jobVacancyRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        jobVacancyRepository.deleteById(id);
    }
}
