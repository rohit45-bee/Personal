package com.job.Service;


import com.job.Models.JobSpecificationAttachment;

import java.util.List;

public interface JobSpecificationAttachmentService {
    JobSpecificationAttachment createJobSpecificationAttachment(JobSpecificationAttachment jobSpecificationAttachment);
    JobSpecificationAttachment updateJobSpecificationAttachment(Long id, JobSpecificationAttachment jobSpecificationAttachment);
    void deleteJobSpecificationAttachment(Long id);
    JobSpecificationAttachment getJobSpecificationAttachmentById(Long id);
    List<JobSpecificationAttachment> getAllJobSpecificationAttachments();
}
