package com.company;

public class Contact {
    private long employeeNum;
    private String firstName;
    private String lastName;
    private Integer shift;

    public Contact(long employeeNum, String firstName, String lastName, Integer shift) {
        this.employeeNum = employeeNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shift = shift;
    }

    public long getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(long employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getShift() {
        return shift;
    }

    public void setShift(Integer shift) {
        this.shift = shift;
    }

    public void printAll(){
        System.out.println("Name: "+firstName+ " "+lastName+"\nNumber: "+
                employeeNum+"\nshift:"+shift);

    }
}
