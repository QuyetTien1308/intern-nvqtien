package com.example.tien.FinalExercise;

public class Receptionist extends Employee{
    public Receptionist(){
        super();
    }

    public Receptionist(int ID, String name, int age, int position, int day, int overtime) {
        super(ID, name, age, position, day, overtime);
    }

    @Override
    public long Salary() {
        if(getOvertime()>0)
            return 350000*getDay() + 300000;
        else
            return 350000*getDay();
    }

    @Override
    public void Show() {
        System.out.println("Total money for " + getName() + " is: " + Salary());
    }

    @Override
    public void InputInfo(int id, int pos) {
        super.InputInfo(id, pos);
    }
}
