package com.job.Repository;


import com.job.Models.JobInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobInterviewRepository extends JpaRepository<JobInterview, Long> {
}
