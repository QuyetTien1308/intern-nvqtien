package com.example.tien.Final.service;

import com.example.tien.Final.Dto.EmployeeDto;
import com.example.tien.Final.Dto.PositionDto;
import com.example.tien.Final.entity.Employee;
import com.example.tien.Final.entity.Position;
import com.example.tien.Final.repos.EmployeeRepository;
import com.example.tien.Final.repos.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository ;
    @Autowired
    private PositionRepository positionRepository;
    @Autowired
    private PositionService positionService;


    //    public List<User> getAllUser() {
//        return userRepository.findAll();
//    }
    public List<EmployeeDto> getEmployee(){
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        for(Employee employee : employees){

            EmployeeDto employeeDto = EmployeeDto.builder()
                    .id(employee.getId())
                    .username(employee.getUsername())
                    .password(employee.getPassword())
                    .name(employee.getName())
                    .positionId(employee.getPosition().getId())
//                    .salaryId(employee.getSalaries())
                    .build();
            Position position = positionRepository.findById(employee.getPosition().getId()).orElseThrow(() -> new RuntimeException("Position not found"));
            PositionDto positionDto = PositionDto.builder()
                    .id(position.getId())
                    .name(position.getName())
//                    .pay(position.getPay())
                    .build();

            employeeDtos.add(employeeDto);
        }
        return employeeDtos;
    }

    //    public List<PositionDto> getPosition(){
//        List<Position> positions=positionRepository.findAll();
//        List<PositionDto> positionDtos=new ArrayList<>();
//        for(Position position:positions){
//            PositionDto positionDto=PositionDto.builder()
////                    .id(position.getId())
//                    .name(position.getName())
//                    .pay(position.getPay())
//                    .build();
//            positionDtos.add(positionDto);
//        }
//        return positionDtos;
//    }
//    public User getUserByName(String name){
//        return userRepository.findAllByName(name);
//    }
//
    public Employee saveEmployee(EmployeeDto userDto){
        Position position = positionService.getPositionById(userDto.getPositionId());
//        Attendance attendance = attendanceService.getAttendanceById(userDto.getAttendanceId());
        Employee user = Employee.builder()
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .name(userDto.getName())
                .position(position)
//                .attendance(attendance)
                .build();
        return employeeRepository.save(user);
    }
//    public List<User> saveUsers(List<User> Users){
//        return userRepository.saveAll(Users);
//    }
//    public String deleteUser(int id){
//        userRepository.deleteById(id);
//        return "User removed !!" + id;
//    }
//    //    public User updateUser(User User){
////
////        User existUser = userRepository.findById(User.getId()).orElse(null);
////        existUser.setName(User.getName());
////        existUser.setUsername(User.getUsername());
////        existUser.setPassword(User.getPassword());
////        existUser.setPosition(User.getPosition());
////
//////        existUser.setUser(User.getUser());
////        return userRepository.save(existUser);
////    }
//    public UserDto updateUser(UserDto userDto){
//        Position position = positionService.getPositionById(userDto.getPositionId());
//        User user = userRepository.findById(userDto.getId()).orElseThrow(()-> new RuntimeException("User Not Found"));
//        user.setUsername(userDto.getUsername());
//        user.setPassword(userDto.getPassword());
//        user.setName(userDto.getName());
//        user.setPosition(position);
//        userRepository.save(user);
//        return userDto;
//    }
//
////    public void deleteAllUser(){
////        userRepository.deleteAll();
////    }
}
