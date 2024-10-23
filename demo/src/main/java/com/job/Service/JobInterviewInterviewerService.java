package com.job.Service;



import com.job.Models.JobInterviewInterviewer;

import java.util.List;

public interface JobInterviewInterviewerService {
    JobInterviewInterviewer createJobInterviewInterviewer(JobInterviewInterviewer jobInterviewInterviewer);
    JobInterviewInterviewer updateJobInterviewInterviewer(Long interviewId, JobInterviewInterviewer jobInterviewInterviewer);
    void deleteJobInterviewInterviewer(Long interviewId);
    JobInterviewInterviewer getJobInterviewInterviewerById(Long interviewId);
    List<JobInterviewInterviewer> getAllJobInterviewInterviewers();
}
