package com.example.tien.FinalExercise.MenuTest;

import com.example.tien.FinalExercise.Accountant;
import com.example.tien.FinalExercise.Employee;
import com.example.tien.FinalExercise.Manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
    public void output() throws IOException{


        System.out.println("Choose ID position employee: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int number = scanner.nextInt();
        Employee[] employees = new Employee[number];
        int choose = scanner.nextInt();
        switch (choose){
            case 1:{
                Manager manager = new Manager();
                manager.ListEmployee(employees);
                String highesMananager = manager.Highest(employees);
                if(highesMananager.equals("")){
                    System.out.println("Don't have employee");
                }
                else
                    System.out.println(highesMananager);
                break;
            }
            case 2:{
                Accountant accountant = new Accountant();
                accountant.ListEmployee(employees);
                break;
            }
            case 3:{
                for (int i = 0; i < number; i++) {
                    if (employees[i].getPosition() == 3) {
                        employees[i].Show();
                    }
                }
                break;
            }
            case 4:{
                for (int i = 0; i < number; i++){
                    if(employees[i].getPosition()==4){
                        employees[i].Show();
                    }
                }
                break;
            }
            case 5:{
                for (int i = 0; i < number; i++){
                    if(employees[i].getPosition()==5){
                        employees[i].Show();
                    }
                }
                break;
            }

        }
    }
}
