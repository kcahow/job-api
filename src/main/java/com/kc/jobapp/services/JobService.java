package com.kc.jobapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kc.jobapp.dtos.JobResponseDto;
import com.kc.jobapp.repository.JobRepository;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }   
    
    /**
     * Retrieves all jobs from the repository.
     *
     * @return List of JobResponseDto containing job details.
     */
    public List<JobResponseDto> getAllJobs() {
        return jobRepository.findAll().stream()
                .map(job -> new JobResponseDto(job.getId(), job.getTitle(), job.getDescription(), job.getMinSalary(), job.getMaxSalary(), job.getLocation()))
                .toList();
    }

    /**
     * Retrieves active jobs from the repository.
     *
     * @return List of JobResponseDto containing active job details.
     */
    public List<JobResponseDto> getActiveJobs() {
        return jobRepository.findByIsActive(true).stream()
                .map(job -> new JobResponseDto(job.getId(), job.getTitle(), job.getDescription(), job.getMinSalary(), job.getMaxSalary(), job.getLocation()))
                .toList();
    }
    
}
