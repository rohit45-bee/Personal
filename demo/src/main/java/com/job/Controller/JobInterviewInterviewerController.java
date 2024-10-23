package com.job.Controller;


import com.job.Models.JobInterviewInterviewer;
import com.job.Service.JobInterviewInterviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job-interview-interviewers")
public class JobInterviewInterviewerController {

    @Autowired
    private JobInterviewInterviewerService jobInterviewInterviewerService;

    @PostMapping
    public ResponseEntity<JobInterviewInterviewer> createJobInterviewInterviewer(@RequestBody JobInterviewInterviewer jobInterviewInterviewer) {
        return ResponseEntity.ok(jobInterviewInterviewerService.createJobInterviewInterviewer(jobInterviewInterviewer));
    }

    @PutMapping("/{interviewId}")
    public ResponseEntity<JobInterviewInterviewer> updateJobInterviewInterviewer(@PathVariable Long interviewId, @RequestBody JobInterviewInterviewer jobInterviewInterviewer) {
        return ResponseEntity.ok(jobInterviewInterviewerService.updateJobInterviewInterviewer(interviewId, jobInterviewInterviewer));
    }

    @DeleteMapping("/{interviewId}")
    public ResponseEntity<Void> deleteJobInterviewInterviewer(@PathVariable Long interviewId) {
        jobInterviewInterviewerService.deleteJobInterviewInterviewer(interviewId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{interviewId}")
    public ResponseEntity<JobInterviewInterviewer> getJobInterviewInterviewerById(@PathVariable Long interviewId) {
        return ResponseEntity.ok(jobInterviewInterviewerService.getJobInterviewInterviewerById(interviewId));
    }

    @GetMapping
    public ResponseEntity<List<JobInterviewInterviewer>> getAllJobInterviewInterviewers() {
        return ResponseEntity.ok(jobInterviewInterviewerService.getAllJobInterviewInterviewers());
    }
}
