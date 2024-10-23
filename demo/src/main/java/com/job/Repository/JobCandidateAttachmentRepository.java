package com.job.Repository;

import com.job.Models.JobCandidateAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobCandidateAttachmentRepository extends JpaRepository<JobCandidateAttachment, Long> {
}
