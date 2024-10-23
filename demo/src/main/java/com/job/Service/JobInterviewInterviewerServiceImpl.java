package com.job.Service;


import com.job.Models.JobInterviewInterviewer;
import com.job.Repository.JobInterviewInterviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobInterviewInterviewerServiceImpl implements JobInterviewInterviewerService {

    @Autowired
    private JobInterviewInterviewerRepository jobInterviewInterviewerRepository;

    @Override
    public JobInterviewInterviewer createJobInterviewInterviewer(JobInterviewInterviewer jobInterviewInterviewer) {
        return jobInterviewInterviewerRepository.save(jobInterviewInterviewer);
    }

    @Override
    public JobInterviewInterviewer updateJobInterviewInterviewer(Long interviewId, JobInterviewInterviewer jobInterviewInterviewer) {
        Optional<JobInterviewInterviewer> existingInterview = jobInterviewInterviewerRepository.findById(interviewId);
        if (existingInterview.isPresent()) {
            JobInterviewInterviewer updatedInterview = existingInterview.get();
            updatedInterview.setInterviewerId(jobInterviewInterviewer.getInterviewerId());
            return jobInterviewInterviewerRepository.save(updatedInterview);
        }
        return null;
    }


    @Override
    public void deleteJobInterviewInterviewer(Long interviewId) {
        jobInterviewInterviewerRepository.deleteById(interviewId);
    }

    @Override
    public JobInterviewInterviewer getJobInterviewInterviewerById(Long interviewId) {
        return jobInterviewInterviewerRepository.findById(interviewId).orElse(null);
    }

    @Override
    public List<JobInterviewInterviewer> getAllJobInterviewInterviewers() {
        return jobInterviewInterviewerRepository.findAll();
    }
}
