package com.example.tien.FinalExercise.MenuTest;

import com.example.tien.FinalExercise.*;
import com.example.tien.FinalExercise.File.ReadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {


    public void INPUT() throws IOException {

        Scanner scanner = new Scanner(System.in);
        String Line = "";

        System.out.println("Input number employee:");
        int number = scanner.nextInt();
        Employee[] employees = new Employee[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Input employees " + (i + 1));
            System.out.println("Choose Position: \n 1: Manager \n 2: Accountant \n 3: Receptionist \n 4: SanitationWorker \n 5: Engineer");
            int pos = scanner.nextInt();
            switch (pos) {
                case 1: {
                    employees[i] = new Manager();
                    employees[i].InputInfo(i, pos);
                    employees[i].Salary();

                    break;
                }
                case 2: {
                    employees[i] = new Accountant();
                    employees[i].InputInfo(i, pos);
                    employees[i].Salary();

                    break;
                }
                case 3: {
                    employees[i] = new Receptionist();
                    employees[i].InputInfo(i, pos);
                    employees[i].Salary();

                    break;
                }
                case 4: {
                    employees[i] = new SanitationWorker();
                    employees[i].InputInfo(i, pos);
                    employees[i].Salary();

                    break;
                }
                case 5: {
                    employees[i] = new Engineer();
                    employees[i].InputInfo(i, pos);
                    employees[i].Salary();

                    break;
                }
                default:
                    throw new IllegalAccessError("Unexpected: " + pos);

            }

        }
    }


}
