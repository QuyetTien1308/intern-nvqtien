package com.example.tien.FinalExercise;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Line ="";
        System.out.println("Input number employee:");
        int number = scanner.nextInt();
        Employee[] employees = new Employee[number];
        for(int i = 0; i < number; i++){
            System.out.println("Input employees" +(i+1));
            System.out.println("Choose Position: \n 1: Manager \n 2: Accountant \n 3: Receptionist \n 4: SanitationWorker \n 5: Engineer");
            int pos = scanner.nextInt();
            switch (pos){
                case 1:{
                    employees[i] = new Manager();
                    employees[i].InputInfo(i,pos);
                    employees[i].Salary();
                    break;
                }
                case 2:{
                    employees[i] = new Accountant();
                    employees[i].InputInfo(i,pos);
                    employees[i].Salary();
                    break;
                }
                case 3:{
                    employees[i] = new Receptionist();
                    employees[i].InputInfo(i,pos);
                    employees[i].Salary();
                    break;
                }
                case 4:{
                    employees[i] = new SanitationWorker();
                    employees[i].InputInfo(i,pos);
                    employees[i].Salary();
                    break;
                }
                case 5:{
                    employees[i] = new Engineer();
                    employees[i].InputInfo(i,pos);
                    employees[i].Salary();

                    break;
                }
                default:
                    throw new IllegalAccessError("Unexpected: " + pos);

            }

        }
        System.out.println("Choose ID position employee: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:{
                Manager manager = new Manager();
                manager.ListEmployee(employees);
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
