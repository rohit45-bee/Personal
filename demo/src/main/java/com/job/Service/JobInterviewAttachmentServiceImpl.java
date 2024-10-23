package com.job.Service;


import com.job.Models.JobInterviewAttachment;
import com.job.Repository.JobInterviewAttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobInterviewAttachmentServiceImpl implements JobInterviewAttachmentService {

    @Autowired
    private JobInterviewAttachmentRepository jobInterviewAttachmentRepository;

    @Override
    public JobInterviewAttachment save(JobInterviewAttachment jobInterviewAttachment) {
        return jobInterviewAttachmentRepository.save(jobInterviewAttachment);
    }


    @Override
    public Optional<JobInterviewAttachment> findById(Long id) {
        return jobInterviewAttachmentRepository.findById(id);
    }

    @Override
    public List<JobInterviewAttachment> findAll() {
        return jobInterviewAttachmentRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        jobInterviewAttachmentRepository.deleteById(id);
    }
}
