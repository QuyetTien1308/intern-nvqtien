package com.example.tien.Final.Dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PositionDto {
    private int id;
    private String name ;
    private long pay;

}
