package com.kc.jobapp.dtos;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
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
public class JobRequestDto {

    @NotBlank(message = "Title cannot be blank")
    @Max(value = 100, message = "Title cannot exceed 100 characters")
    private String title;
    @NotBlank(message = "Description cannot be blank")
    @Max(value = 500, message = "Description cannot exceed 500 characters")
    private String description;
    @NotBlank(message = "Company min salary cannot be blank")
    @DecimalMin(value = "10000.00", message = "Minimum salary must be greater than or equal to $10,000.00")
    private Double minSalary;
    @DecimalMax(value = "500000.00", message = "Maximum salary must be less than or equal to $500,000.00")
    private Double maxSalary;
    @NotBlank(message = "Location cannot be blank")
    @Max(value = 100, message = "Location cannot exceed 100 characters")
    private String location;

}
