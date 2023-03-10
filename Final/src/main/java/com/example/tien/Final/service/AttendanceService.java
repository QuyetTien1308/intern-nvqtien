package com.example.tien.Final.service;

import com.example.tien.Final.Dto.AttendanceDto;
import com.example.tien.Final.Dto.PositionDto;
import com.example.tien.Final.entity.Attendance;
import com.example.tien.Final.entity.Position;
import com.example.tien.Final.repos.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<AttendanceDto> getAttendance(){
        List<Attendance> attendances = attendanceRepository.findAll();
        List<AttendanceDto> attendanceDtos = new ArrayList<>();
        for (Attendance attendance : attendances){
            AttendanceDto attendanceDto = AttendanceDto.builder()
                    .id(attendance.getId())
                    .date(attendance.getDate())
                    .daysWorked(attendance.getDaysWorked())
                    .build();
            attendanceDtos.add(attendanceDto);
        }
        return attendanceDtos;
    }


    public Attendance getAttendanceById(int id){
        return attendanceRepository.findById(id).orElseThrow(()-> new RuntimeException("Error"));
    }
    public Attendance saveAttendance(AttendanceDto attendanceDto){
        Attendance attendance = Attendance.builder()
                .date(attendanceDto.getDate())
                .daysWorked(attendanceDto.getDaysWorked())
                .build();
        return attendanceRepository.save(attendance);
    }
//    public List<Attendance> saveAttendances(List<Attendance> attendances){
//        return attendanceRepository.saveAll(attendances);
//    }
//    public String deleteAttendance(int id){
//        attendanceRepository.deleteById(id);
//        return "Attendance Remove !! " + id;
//    }
//    public Attendance updateAttendance(Attendance attendance){
//        Attendance existAttendance = attendanceRepository.findById(attendance.getId()).orElse(null);
//        existAttendance.setDate(attendance.getDate());
//        existAttendance.setDaysWorked(attendance.getDaysWorked());
//        return attendanceRepository.save(existAttendance);
//    }
}
