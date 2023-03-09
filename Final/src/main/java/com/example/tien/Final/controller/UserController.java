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

    @PutMapping("/updateUser")
    private User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }
    @DeleteMapping("/deleteUser/{id}")
    private String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }
}
