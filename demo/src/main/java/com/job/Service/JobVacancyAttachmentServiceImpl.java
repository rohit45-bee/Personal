package com.job.Service;


import com.job.Models.JobVacancyAttachment;
import com.job.Repository.JobVacancyAttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobVacancyAttachmentServiceImpl implements JobVacancyAttachmentService {

    @Autowired
    private JobVacancyAttachmentRepository jobVacancyAttachmentRepository;

    @Override
    public JobVacancyAttachment save(JobVacancyAttachment jobVacancyAttachment) {
        return jobVacancyAttachmentRepository.save(jobVacancyAttachment);
    }

    @Override
    public JobVacancyAttachment update(Long id, JobVacancyAttachment jobVacancyAttachment) {
        Optional<JobVacancyAttachment> existingAttachment = jobVacancyAttachmentRepository.findById(id);
        if (existingAttachment.isPresent()) {
            JobVacancyAttachment attachment = existingAttachment.get();
            attachment.setVacancyId(jobVacancyAttachment.getVacancyId());
            attachment.setFileName(jobVacancyAttachment.getFileName());
            attachment.setFileType(jobVacancyAttachment.getFileType());
            attachment.setFileSize(jobVacancyAttachment.getFileSize());
            attachment.setFileContent(jobVacancyAttachment.getFileContent());
            attachment.setAttachmentType(jobVacancyAttachment.getAttachmentType());
            attachment.setComment(jobVacancyAttachment.getComment());
            return jobVacancyAttachmentRepository.save(attachment);
        } else {
            throw new RuntimeException("Attachment not found with id " + id);
        }
    }


    @Override
    public void delete(Long id) {
        jobVacancyAttachmentRepository.deleteById(id);
    }

    @Override
    public JobVacancyAttachment findById(Long id) {
        return jobVacancyAttachmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Attachment not found with id " + id));
    }

    @Override
    public List<JobVacancyAttachment> findAll() {
        return jobVacancyAttachmentRepository.findAll();
    }
}
