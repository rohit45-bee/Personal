package com.job.Repository;

import com.job.Models.JobtitEmpstat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobtitEmpstatRepository extends JpaRepository<JobtitEmpstat, String> {
}
