package com.example.tien.FinalExercise;

public class Accountant extends Employee{
    public Accountant(){
        super();
    }

    public Accountant(int ID, String name, int age, int position, int day, int overtime) {
        super(ID, name, age, position, day, overtime);
    }

    @Override
    public long Salary() {
        if(getOvertime()>0)
            return 500000*getDay() + 300000;
        else
            return 500000*getDay();
    }

    @Override
    public void Show() {
        System.out.println("Total money for " + getName() + " is: " + Salary());
    }

    public void ListEmployee(Employee[] employee){
        for(int i = 0; i < employee.length; i++){
            employee[i].Show();
        }
    }
    @Override
    public void InputInfo(int id, int pos) {
        super.InputInfo(id, pos);
    }
}
