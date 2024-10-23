package com.job.Service;


import com.job.Models.JobtitEmpstat;

import java.util.List;
import java.util.Optional;

public interface JobtitEmpstatService {
    JobtitEmpstat createJobtitEmpstat(JobtitEmpstat jobtitEmpstat);
    JobtitEmpstat updateJobtitEmpstat(String jobtitCode, JobtitEmpstat jobtitEmpstat);
    void deleteJobtitEmpstat(String jobtitCode);
    List<JobtitEmpstat> getAllJobtitEmpstat();
    Optional<JobtitEmpstat> getJobtitEmpstatByJobtitCode(String jobtitCode);
}
