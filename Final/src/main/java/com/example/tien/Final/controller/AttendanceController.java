//package com.example.tien.Final.entity.controller;
//
//import com.example.tien.Final.entity.Attendance;
//import com.example.tien.Final.service.AttendanceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Date;
//import java.util.List;
//@RestController
//public class AttendanceController {
//    @Autowired
//    private AttendanceService service;
//    @GetMapping("/Attendances")
//    private List<Attendance> findAllAttendance(){
//        return service.getAttendance();
//    }
//    @GetMapping("/Attendance/{date}")
//    public Attendance findAllAttendanceByDate(@PathVariable String date){
//        return service.getPositionByDate(date);
//    }
//    @PostMapping("/addAttendance")
//    public Attendance addAttendance(@RequestBody Attendance attendance){
//        return service.saveAttendance(attendance);
//    }
//    @PostMapping("/addAttendances")
//    public List<Attendance> attendances(@RequestBody List<Attendance> attendances){
//        return service.saveAttendances(attendances);
//    }
//}
