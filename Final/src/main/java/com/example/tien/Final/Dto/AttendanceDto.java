package com.example.tien.Final.Dto;

import jakarta.persistence.Column;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceDto {
    private int id;
    private String date;

    private int daysWorked;
}
