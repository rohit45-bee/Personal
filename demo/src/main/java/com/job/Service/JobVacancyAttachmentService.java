package com.job.Service;


import com.job.Models.JobVacancyAttachment;

import java.util.List;

public interface JobVacancyAttachmentService {
    JobVacancyAttachment save(JobVacancyAttachment jobVacancyAttachment);
    JobVacancyAttachment update(Long id, JobVacancyAttachment jobVacancyAttachment);
    void delete(Long id);
    JobVacancyAttachment findById(Long id);
    List<JobVacancyAttachment> findAll();
}
