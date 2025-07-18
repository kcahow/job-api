package com.kc.jobapp.dtos;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JobResponseDto {

    private UUID id;
    private String title;
    private String description;
    private Double minSalary;
    private Double maxSalary;
    private String location;

}

