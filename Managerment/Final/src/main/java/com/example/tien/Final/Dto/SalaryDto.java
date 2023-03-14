package com.example.tien.Final.Dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalaryDto {
    private Long id;
    private double baseSalary;
    private int daysWorked;
    private double overtimeSalary;
}
