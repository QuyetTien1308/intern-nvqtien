package com.example.tien.Final.repos;

import com.example.tien.Final.entity.Position;
import com.example.tien.Final.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PositionRepository extends JpaRepository<Position, Integer> {


    Position findAllByName(String name);
}
