package com.example.tien.FinalExercise;

public class Engineer extends Employee{
    private String Type;
    public Engineer(){
        super();
    }
    public Engineer(String Type){
        super();
        this.Type = Type;
    }



    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public long Salary() {
        if(getOvertime()>0)
            return 800000*getDay() + 300000;
        else
            return 800000*getDay();
    }

    @Override
    public void Show() {
        System.out.println("Total money for " + getName() + " is: " + Salary() + " Type: " + getType());
    }

    @Override
    public void InputInfo(int id, int pos) {
        super.InputInfo(id, pos);
        System.out.println("Input type engineer: ");
        scanner.nextLine();
        Type = scanner.nextLine();
    }
}
