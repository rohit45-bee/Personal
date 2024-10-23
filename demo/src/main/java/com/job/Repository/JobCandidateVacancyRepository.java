package com.job.Repository;


import com.job.Models.JobCandidateVacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobCandidateVacancyRepository extends JpaRepository<JobCandidateVacancy, Long> {
    // Custom query methods can be added here if needed
}
