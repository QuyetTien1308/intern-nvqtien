package com.example.tien.Final.Dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int id;
    private String username;
    private String password;
    private String name;
    private int positionId;
//    private int attendanceId;
}
