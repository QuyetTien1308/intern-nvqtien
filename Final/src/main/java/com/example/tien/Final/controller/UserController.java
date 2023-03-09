package com.example.tien.Final.controller;

import com.example.tien.Final.Dto.UserDto;
import com.example.tien.Final.entity.Position;
import com.example.tien.Final.entity.User;
import com.example.tien.Final.repos.UserRepository;
import com.example.tien.Final.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/Users")
    private List<UserDto> findAllUser(){
        return service.getUser();
    }
    @GetMapping("/User/{name}")
    private User findAllByName(@PathVariable String name){
        return service.getUserByName(name);
    }
    @PostMapping("/addUser")
    private User addUser(@RequestBody UserDto user){
        return service.saveUser(user);
    }

    @PutMapping("/updateUser/{id}")
    private UserDto updateUser(@PathVariable int id ,@RequestBody UserDto userDto){
        userDto.setId(id);
        return service.updateUser(userDto);
    }
    @DeleteMapping("/deleteUser/{id}")
    private String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }
}
