package com.job.Repository;


import com.job.Models.JobVacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobVacancyRepository extends JpaRepository<JobVacancy, Long> {
}
