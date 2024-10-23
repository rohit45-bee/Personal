package com.job.Repository;


import com.job.Models.JobVacancyAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobVacancyAttachmentRepository extends JpaRepository<JobVacancyAttachment, Long> {
    // Additional query methods if needed
}
