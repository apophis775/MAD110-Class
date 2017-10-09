package com.company;

import java.text.DecimalFormat;


public class Employee {
    private String name;
    private Position department;
    private Boolean salary;
    private double payrate;
    private Integer shift;
    private String startdate;


    public Employee(String name, Position department, Boolean salary, double payrate, Integer shift, String startdate) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.payrate = payrate;
        this.shift = shift;
        this.startdate = startdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getDepartment() {
        return department;
    }

    public void setDepartment(Position department) {
        this.department = department;
    }

    public Boolean getSalary() {
        return salary;
    }

    public void setSalary(Boolean salary) {
        this.salary = salary;
    }

    public double getPayrate() {
        return payrate;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }

    public Integer getShift() {
        return shift;
    }

    public void setShift(Integer shift) {
        this.shift = shift;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public void calculate(Integer hours)
    {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        double pay;

        if(hours > 40 && !salary){
            double overtime = hours-40;
            pay = (hours*payrate)+((overtime*(payrate*1.5)));
        }
        else
            pay=hours*payrate;

        switch(shift)
        {
            case 1:
                pay=pay;
                break;
            case 2:
                pay=pay+(pay*.05);
                break;
            case 3:
                pay=pay+(pay*.1);
                break;
            default:
                break;
        }

        System.out.println("Rate of Pay: $"+df.format(payrate)+" per hour\nHours: "+hours+"\n"+name+" Earned $"+df.format(pay)+" this week");



        //System.out.println("Suggested Tip: $"+df.format(tipped));




    }

    public void display()
    {
        System.out.println("Name: "+name+"\nPosition: "+department+"\nOn Salary? "+salary+
        "\nShift: "+shift);



    }


}


