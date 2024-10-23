package com.job.Service;


import com.job.Models.JobSpecificationAttachment;
import com.job.Repository.JobSpecificationAttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSpecificationAttachmentServiceImpl implements JobSpecificationAttachmentService {

    @Autowired
    private JobSpecificationAttachmentRepository jobSpecificationAttachmentRepository;

    @Override
    public JobSpecificationAttachment createJobSpecificationAttachment(JobSpecificationAttachment jobSpecificationAttachment) {
        return jobSpecificationAttachmentRepository.save(jobSpecificationAttachment);
    }

    @Override
    public JobSpecificationAttachment updateJobSpecificationAttachment(Long id, JobSpecificationAttachment jobSpecificationAttachment) {
        Optional<JobSpecificationAttachment> existingAttachment = jobSpecificationAttachmentRepository.findById(id);
        if (existingAttachment.isPresent()) {
            JobSpecificationAttachment updatedAttachment = existingAttachment.get();
            updatedAttachment.setJobTitleId(jobSpecificationAttachment.getJobTitleId());
            updatedAttachment.setFileName(jobSpecificationAttachment.getFileName());
            updatedAttachment.setFileType(jobSpecificationAttachment.getFileType());
            updatedAttachment.setFileSize(jobSpecificationAttachment.getFileSize());
            updatedAttachment.setFileContent(jobSpecificationAttachment.getFileContent());
            return jobSpecificationAttachmentRepository.save(updatedAttachment);
        }
        return null;
    }



    @Override
    public void deleteJobSpecificationAttachment(Long id) {
        jobSpecificationAttachmentRepository.deleteById(id);
    }

    @Override
    public JobSpecificationAttachment getJobSpecificationAttachmentById(Long id) {
        return jobSpecificationAttachmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<JobSpecificationAttachment> getAllJobSpecificationAttachments() {
        return jobSpecificationAttachmentRepository.findAll();
    }
}
