package com.kc.jobapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.kc.jobapp.dtos.JobResponseDto;
import com.kc.jobapp.services.JobService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin(origins = "*")
@Tag(name = "Job Controller", description = "Controller for managing job operations")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    /**
     * Endpoint to retrieve all jobs.
     *
     * @return List of JobResponseDto containing job details.
     */
    @GetMapping("/")
    @Operation(summary = "Get all jobs", description = "Retrieves a list of all jobs in the database")
    public List<JobResponseDto> getAllJobs() {
        return jobService.getAllJobs();
    }   

    /**
     * Endpoint to retrieve active jobs.
     *
     * @return List of JobResponseDto containing active job details.
     */
    @GetMapping("/active")
    @Operation(summary = "Get active jobs", description = "Retrieves a list of active jobs in the database")
    public List<JobResponseDto> getActiveJobs() {
        return jobService.getActiveJobs();
    }
    

}
