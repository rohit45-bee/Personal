package com.job.Service;


import com.job.Models.JobtitEmpstat;
import com.job.Repository.JobtitEmpstatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobtitEmpstatServiceImpl implements JobtitEmpstatService {

    @Autowired
    private JobtitEmpstatRepository jobtitEmpstatRepository;

    @Override
    public JobtitEmpstat createJobtitEmpstat(JobtitEmpstat jobtitEmpstat) {
        return jobtitEmpstatRepository.save(jobtitEmpstat);
    }

    @Override
    public JobtitEmpstat updateJobtitEmpstat(String jobtitCode, JobtitEmpstat jobtitEmpstat) {
        Optional<JobtitEmpstat> existingJobtitEmpstat = jobtitEmpstatRepository.findById(jobtitCode);
        if (existingJobtitEmpstat.isPresent()) {
            JobtitEmpstat updatedJobtitEmpstat = existingJobtitEmpstat.get();
            updatedJobtitEmpstat.setEstatCode(jobtitEmpstat.getEstatCode());
            return jobtitEmpstatRepository.save(updatedJobtitEmpstat);
        } else {
            return null; // Handle not found case
        }
    }



    @Override
    public void deleteJobtitEmpstat(String jobtitCode) {
        jobtitEmpstatRepository.deleteById(jobtitCode);
    }

    @Override
    public List<JobtitEmpstat> getAllJobtitEmpstat() {
        return jobtitEmpstatRepository.findAll();
    }

    @Override
    public Optional<JobtitEmpstat> getJobtitEmpstatByJobtitCode(String jobtitCode) {
        return jobtitEmpstatRepository.findById(jobtitCode);
    }
}
