package com.job.Service;


import com.job.Models.JobInterviewAttachment;

import java.util.List;
import java.util.Optional;

public interface JobInterviewAttachmentService {

    JobInterviewAttachment save(JobInterviewAttachment jobInterviewAttachment);

    Optional<JobInterviewAttachment> findById(Long id);

    List<JobInterviewAttachment> findAll();

    void deleteById(Long id);
}
