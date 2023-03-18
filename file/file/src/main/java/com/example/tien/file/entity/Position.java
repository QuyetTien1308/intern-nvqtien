package com.example.tien.file.entity;

import com.example.tien.file.Engineer;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "position_tbl")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name ;
    //    @Column(name = "pay")
//    private long pay;
    @OneToOne(mappedBy = "position")
    private Engineer engineer;

}