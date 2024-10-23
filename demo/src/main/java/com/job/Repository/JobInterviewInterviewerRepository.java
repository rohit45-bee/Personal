package com.job.Repository;


import com.job.Models.JobInterviewInterviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobInterviewInterviewerRepository extends JpaRepository<JobInterviewInterviewer, Long> {
}
