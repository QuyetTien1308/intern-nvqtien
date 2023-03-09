package com.example.tien.Final.repos;

import com.example.tien.Final.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findAllByName(String name);
}
