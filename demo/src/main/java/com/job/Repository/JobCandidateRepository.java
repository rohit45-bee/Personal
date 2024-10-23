package com.job.Repository;


import com.job.Models.JobCandidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobCandidateRepository extends JpaRepository<JobCandidate, Long> {
}