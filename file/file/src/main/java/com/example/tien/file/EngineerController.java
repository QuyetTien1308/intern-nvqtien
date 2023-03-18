package com.example.tien.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
@RestController
public class EngineerController {
    @Autowired
    private EngineerService engineerService;
    @GetMapping("/engineers")
    public List<Engineer> getAllEngineers() throws IOException {
        return engineerService.getAllEngineers();
    }

    @PostMapping("/engineers")
    public void saveUsersFromFile()  {
        // Đọc dữ liệu từ file .txt và chuyển đổi sang định dạng của model
        List<Engineer> userList = engineerService.readUsersFromFile();

        // Lưu dữ liệu vào database
        for (Engineer engineer : userList) {
            engineerService.save(engineer);
        }

    }
}
