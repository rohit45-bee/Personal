package com.job.Repository;


import com.job.Models.JobCandidateHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobCandidateHistoryRepository extends JpaRepository<JobCandidateHistory, Long> {
    // Custom query methods can be added here if needed
}
