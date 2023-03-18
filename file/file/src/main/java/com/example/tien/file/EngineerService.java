package com.example.tien.file;


import com.example.tien.file.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Service
public class EngineerService {
    @Autowired
    private EngineersRepository engineersRepository;
    private final String FILENAME = "D:\\Downloads\\file\\file\\engineers.txt";

    public List<Engineer> getAllEngineers() throws IOException {
        List<Engineer> engineers = new ArrayList<>();

        File file = new File(FILENAME);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            Engineer engineer = new Engineer();
            engineer.setId(Long.parseLong(tokens[0]));
            engineer.setUsername(tokens[1]);
            engineer.setPassword(Integer.parseInt(tokens[2]));
            engineer.setName(tokens[3]);
            Position position = new Position();
            position.setId(Long.parseLong(tokens[4]));
            engineer.setPosition(position);


//            Long id = Long.parseLong(tokens[0]);
//            String username = tokens[1];
//            int password = Integer.parseInt(tokens[2]);
//            String name = tokens[3];



//            Engineer engineer = new Engineer(id, username, password, name, position);
            engineers.add(engineer);
        }

        scanner.close();

        return engineers;
    }
    public void save(Engineer engineer) {
        engineersRepository.save(engineer);

    }
    public List<Engineer> readUsersFromFile() {
        List<Engineer> userList = new ArrayList<>();

        try {
            File file = new File(FILENAME);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] tokens = line.split(",");

                Long id = Long.parseLong(tokens[0]);
                String username = tokens[1];
                int password = Integer.parseInt(tokens[2]);
                String name = tokens[3];

                Engineer engineer = new Engineer();
                engineer.setUsername(username);
                engineer.setPassword(password);
                engineer.setName(name);

//                Position position = new Position();
//                position.setId(Long.parseLong(tokens[4]));
//                engineer.setPosition(position);

                userList.add(engineer);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return userList;
    }
}
