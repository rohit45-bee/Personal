package com.job.Repository;


import com.job.Models.JobInterviewAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobInterviewAttachmentRepository extends JpaRepository<JobInterviewAttachment, Long> {
}
