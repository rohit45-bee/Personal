package com.job.Controller;


import com.job.Models.JobCategory;
import com.job.Service.JobCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-category")
public class JobCategoryController {

    @Autowired
    private JobCategoryService jobCategoryService;

    @PostMapping
    public ResponseEntity<JobCategory> create(@RequestBody JobCategory jobCategory) {
        JobCategory savedCategory = jobCategoryService.save(jobCategory);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobCategory> getById(@PathVariable Long id) {
        Optional<JobCategory> category = jobCategoryService.findById(id);
        return category.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<JobCategory>> getAll() {
        List<JobCategory> categories = jobCategoryService.findAll();
        return ResponseEntity.ok(categories);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobCategory> update(@PathVariable Long id, @RequestBody JobCategory jobCategory) {
        Optional<JobCategory> existingCategory = jobCategoryService.findById(id);
        if (existingCategory.isPresent()) {
            JobCategory updatedCategory = existingCategory.get();
            updatedCategory.setName(jobCategory.getName());
            JobCategory savedCategory = jobCategoryService.save(updatedCategory);
            return ResponseEntity.ok(savedCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        jobCategoryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
