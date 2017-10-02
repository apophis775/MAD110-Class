package com.company;

public class Main {

    public static void main(String[] args) {
	    Contact employee1 = new Contact(1, "Bruce", "Wayne", 2);
	    Contact employee2 = new Contact(2, "Clark", "Kent", 1);
	    Contact employee3 = new Contact(3, "Diana", "Prince", 3);

	    employee1.printAll();
	    System.out.println("\n");
        employee2.printAll();
        System.out.println("\n");
        employee3.printAll();
        System.out.println("\n");
    }
}
