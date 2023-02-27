package com.example.tien.FinalExercise;

public class Manager extends Employee{
    public Manager(){
        super();
    }

    public Manager(int ID, String name, int age, int position, int day, int overtime) {
        super(ID, name, age, position, day, overtime);
    }

    @Override
    public long Salary() {
        if(getOvertime()>0)
            return 1500*getDay() + 300;
        else
            return 1500000*getDay();

    }

    @Override
    public void Show() {
        System.out.println("Total money for " + this.getName() + " is: " + this.Salary());

    }

    public void ListEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            employee[i].Show();
        }
    }
    @Override
    public void InputInfo(int id, int pos) {
        super.InputInfo(id, pos);
    }
}
