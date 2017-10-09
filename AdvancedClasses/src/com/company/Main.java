package com.company;

public class Main {

    public static void main(String[] args) {
	Employee emp1 = new Employee("Jane Doe", Position.ADMINISTRATION,true, 27.00, 1, "01MAR17");
	Employee emp2 = new Employee("John Smith", Position.MAINTENANCE, false, 21.00, 3,"02MAR17");
	Employee emp3 = new Employee("Larry Jackson", Position.PRODUCTION, false, 22.00, 2,"03MAR17");

	emp1.display();
	emp1.calculate(45);
	emp2.display();
	emp2.calculate(50);
	emp3.display();
	emp3.calculate(35);


    }
}
