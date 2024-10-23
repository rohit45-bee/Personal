package com.job.Repository;


import com.job.Models.JobSpecificationAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSpecificationAttachmentRepository extends JpaRepository<JobSpecificationAttachment, Long> {
}
