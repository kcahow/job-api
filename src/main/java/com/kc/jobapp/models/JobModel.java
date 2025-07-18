package com.kc.jobapp.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "jobs")
@Builder
public class JobModel {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "min_salary", nullable = false)
    private Double minSalary;
    @Column(name = "max_salary", nullable = false)
    private Double maxSalary;
    @Column(name = "location", nullable = false, length = 100)
    private String location;
    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

}
