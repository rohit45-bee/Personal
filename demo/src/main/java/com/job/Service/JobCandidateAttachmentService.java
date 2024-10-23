package com.job.Service;


import com.job.Models.JobCandidateAttachment;

import java.util.List;
import java.util.Optional;

public interface JobCandidateAttachmentService {
    JobCandidateAttachment saveJobCandidateAttachment(JobCandidateAttachment jobCandidateAttachment);

    Optional<JobCandidateAttachment> getJobCandidateAttachmentById(Long id);

    List<JobCandidateAttachment> getAllJobCandidateAttachments();

    JobCandidateAttachment updateJobCandidateAttachment(Long id, JobCandidateAttachment jobCandidateAttachment);

    boolean deleteJobCandidateAttachmentById(Long id);
}
