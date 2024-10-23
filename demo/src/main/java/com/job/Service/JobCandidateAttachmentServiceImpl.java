package com.job.Service;


import com.job.Models.JobCandidateAttachment;
import com.job.Repository.JobCandidateAttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobCandidateAttachmentServiceImpl implements JobCandidateAttachmentService {

    @Autowired
    private JobCandidateAttachmentRepository jobCandidateAttachmentRepository;

    @Override
    public JobCandidateAttachment saveJobCandidateAttachment(JobCandidateAttachment jobCandidateAttachment) {
        return jobCandidateAttachmentRepository.save(jobCandidateAttachment);
    }

    @Override
    public Optional<JobCandidateAttachment> getJobCandidateAttachmentById(Long id) {
        return jobCandidateAttachmentRepository.findById(id);
    }

    @Override
    public List<JobCandidateAttachment> getAllJobCandidateAttachments() {
        return jobCandidateAttachmentRepository.findAll();
    }

    @Override
    public JobCandidateAttachment updateJobCandidateAttachment(Long id, JobCandidateAttachment jobCandidateAttachment) {
        if (jobCandidateAttachmentRepository.existsById(id)) {
            jobCandidateAttachment.setId(id);
            return jobCandidateAttachmentRepository.save(jobCandidateAttachment);
        }
        return null;
    }

    @Override
    public boolean deleteJobCandidateAttachmentById(Long id) {
        if (jobCandidateAttachmentRepository.existsById(id)) {
            jobCandidateAttachmentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
