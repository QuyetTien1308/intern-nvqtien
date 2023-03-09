//package com.example.tien.Final.service;
//
//import com.example.tien.Final.entity.Attendance;
//import com.example.tien.Final.entity.Position;
//import com.example.tien.Final.repos.AttendanceRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class AttendanceService {
//    @Autowired
//    private AttendanceRepository attendanceRepository;
//
//    public List<Attendance> getAttendance(){
//        return attendanceRepository.findAll();
//    }
//    public Attendance getPositionByDate(String date){
//        return attendanceRepository.findByDate(date);
//    }
//    public Attendance saveAttendance(Attendance attendance){
//        return attendanceRepository.save(attendance);
//    }
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
//}
