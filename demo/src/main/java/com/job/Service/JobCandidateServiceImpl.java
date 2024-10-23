package com.job.Service;


import com.job.Models.JobCandidate;
import com.job.Repository.JobCandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobCandidateServiceImpl implements JobCandidateService {

    @Autowired
    private JobCandidateRepository jobCandidateRepository;

    @Override
    public JobCandidate saveJobCandidate(JobCandidate jobCandidate) {
        return jobCandidateRepository.save(jobCandidate);
    }


    @Override
    public Optional<JobCandidate> getJobCandidateById(Long id) {
        return jobCandidateRepository.findById(id);
    }

    @Override
    public List<JobCandidate> getAllJobCandidates() {
        return jobCandidateRepository.findAll();
    }

    @Override
    public JobCandidate updateJobCandidate(Long id, JobCandidate jobCandidate) {
        if (jobCandidateRepository.existsById(id)) {
            jobCandidate.setId(id);
            return jobCandidateRepository.save(jobCandidate);
        }
        return null;
    }

    @Override
    public boolean deleteJobCandidateById(Long id) {
        if (jobCandidateRepository.existsById(id)) {
            jobCandidateRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
