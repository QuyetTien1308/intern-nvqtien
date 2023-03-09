package com.example.tien.Final.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "overtime_tbl")
public class Overtime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "overtime")
    private int overTime;
    @Column(name = "startday")
    private Date startDay;
    @OneToOne(mappedBy = "overtime")
    private User user;
}
