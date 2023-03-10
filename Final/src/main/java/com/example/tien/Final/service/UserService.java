package com.example.tien.Final.service;

import com.example.tien.Final.Dto.PositionDto;
import com.example.tien.Final.Dto.UserDto;
import com.example.tien.Final.entity.Attendance;
import com.example.tien.Final.entity.Position;
import com.example.tien.Final.entity.User;
import com.example.tien.Final.repos.PositionRepository;
import com.example.tien.Final.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PositionService positionService;
    @Autowired
    private AttendanceService attendanceService;

//    public List<User> getAllUser() {
//        return userRepository.findAll();
//    }
    public List<UserDto> getUser(){
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();
        for(User user : users){

            UserDto userDto = UserDto.builder()
                    .id(user.getId())
                    .username(user.getUsername())
                    .password(user.getPassword())
                    .name(user.getName())
                    .positionId(user.getPosition().getId())
                    .build();
            userDtos.add(userDto);
        }
        return userDtos;
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
    public User getUserByName(String name){
        return userRepository.findAllByName(name);
    }
    public User saveUser(UserDto userDto){
        Position position = positionService.getPositionById(userDto.getPositionId());
//        Attendance attendance = attendanceService.getAttendanceById(userDto.getAttendanceId());
        User user = User.builder()
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .name(userDto.getName())
                .position(position)
//                .attendance(attendance)
                .build();
        return userRepository.save(user);
    }
    public List<User> saveUsers(List<User> Users){
        return userRepository.saveAll(Users);
    }
    public String deleteUser(int id){
        userRepository.deleteById(id);
        return "User removed !!" + id;
    }
//    public User updateUser(User User){
//
//        User existUser = userRepository.findById(User.getId()).orElse(null);
//        existUser.setName(User.getName());
//        existUser.setUsername(User.getUsername());
//        existUser.setPassword(User.getPassword());
//        existUser.setPosition(User.getPosition());
//
////        existUser.setUser(User.getUser());
//        return userRepository.save(existUser);
//    }
    public UserDto updateUser(UserDto userDto){
        Position position = positionService.getPositionById(userDto.getPositionId());
        User user = userRepository.findById(userDto.getId()).orElseThrow(()-> new RuntimeException("User Not Found"));
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setName(userDto.getName());
        user.setPosition(position);
        userRepository.save(user);
        return userDto;
    }

//    public void deleteAllUser(){
//        userRepository.deleteAll();
//    }
}
