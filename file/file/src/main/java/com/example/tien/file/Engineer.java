package com.example.tien.file;

//import com.example.tien.file.entity.Position;
import com.example.tien.file.entity.Position;
import com.example.tien.file.entity.Salary;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "engineer")
public class Engineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private int password;
    private String name;

    @OneToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToMany(mappedBy = "engineer")
    private List<Salary> salaries = new ArrayList<>();

//    private int id;
//    private String name;
//    private int age;
//    private String position;
}
