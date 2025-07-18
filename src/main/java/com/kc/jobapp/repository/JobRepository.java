package com.kc.jobapp.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kc.jobapp.models.JobModel;

public interface JobRepository extends JpaRepository<JobModel, UUID> {
    List<JobModel> findByTitleContainingIgnoreCase(String title);
    List<JobModel> findByTitle(String title);
    List<JobModel> findByLocation(String location);
    List<JobModel> findByIsActive(Boolean isActive);

}
