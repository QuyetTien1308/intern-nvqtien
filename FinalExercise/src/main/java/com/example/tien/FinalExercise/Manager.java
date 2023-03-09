package com.example.tien.FinalExercise;

public class        Manager extends Employee{
    public Manager(){
        super();
    }

    public Manager(int ID, String name, int age, int position, int day, int overtime) {
        super(ID, name, age, position, day, overtime);
    }

    @Override
    public long Salary() {
        if(getOvertime()>0)
            return 1500000*getDay() + 300000;
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

    @Override
    public String Highest(Employee[] employees) {
        double compare = 0;
        String result = "";
//        for(int i = 0; i < employees.length; i++){
//            if(employees[i].getPosition() != 1){
//                compare = employees[i].Salary();
//                break;
//            }
//        }
        for(int i = 0; i < employees.length; i++){
            if(compare < employees[i].Salary() && employees[i].getPosition() != 1){
                compare = employees[i].Salary();
                result = "The person with the highest salary is " + employees[i].getName() + " with: " + employees[i].Salary()+" vnd";
            }
        }
        return result;
    }
}
