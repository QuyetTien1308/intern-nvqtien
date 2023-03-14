package com.example.tien.Final.Dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private int id;
    private String username;
    private String password;
    private String name;

    private int positionId;
    private SalaryDto salaryId;
}
