package com.job.Controller;


import com.job.Models.JobtitEmpstat;
import com.job.Service.JobtitEmpstatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobtit-empstat")
public class JobtitEmpstatController {

    @Autowired
    private JobtitEmpstatService jobtitEmpstatService;

    @PostMapping
    public ResponseEntity<JobtitEmpstat> createJobtitEmpstat(@RequestBody JobtitEmpstat jobtitEmpstat) {
        JobtitEmpstat createdRecord = jobtitEmpstatService.createJobtitEmpstat(jobtitEmpstat);
        return new ResponseEntity<>(createdRecord, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<JobtitEmpstat>> getAllJobtitEmpstat() {
        return new ResponseEntity<>(jobtitEmpstatService.getAllJobtitEmpstat(), HttpStatus.OK);
    }

    @GetMapping("/{jobtitCode}")
    public ResponseEntity<JobtitEmpstat> getJobtitEmpstatByJobtitCode(@PathVariable String jobtitCode) {
        return jobtitEmpstatService.getJobtitEmpstatByJobtitCode(jobtitCode)
                .map(record -> new ResponseEntity<>(record, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{jobtitCode}")
    public ResponseEntity<JobtitEmpstat> updateJobtitEmpstat(@PathVariable String jobtitCode, @RequestBody JobtitEmpstat jobtitEmpstat) {
        JobtitEmpstat updatedRecord = jobtitEmpstatService.updateJobtitEmpstat(jobtitCode, jobtitEmpstat);
        if (updatedRecord != null) {
            return new ResponseEntity<>(updatedRecord, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{jobtitCode}")
    public ResponseEntity<Void> deleteJobtitEmpstat(@PathVariable String jobtitCode) {
        jobtitEmpstatService.deleteJobtitEmpstat(jobtitCode);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
