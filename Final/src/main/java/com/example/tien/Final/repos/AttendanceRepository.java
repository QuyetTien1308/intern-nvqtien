package com.example.tien.Final.repos;

import com.example.tien.Final.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    Attendance findByDate(String date);
}
