package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What are you entering information for?\n1. Business Customer\n2. Residential Customer");
        int choice = sc.nextInt();
        sc.nextLine();
        String busname;
        String name;
        String phone;
        Boolean verified = false;
        do {
            if (choice == 1) {
                System.out.println("Enter your business Name:");
                busname = sc.nextLine();
                System.out.println("Enter your name:");
                name = sc.nextLine();
                System.out.println("Enter your phone numnber:");
                phone = sc.nextLine();
                displayData(busname, name, phone);
                verified = true;
            }
            else if (choice == 2) {
                System.out.println("Enter your name:");
                name = sc.nextLine();
                System.out.println("Enter your phone numnber:");
                phone = sc.nextLine();
                displayData(name, phone);
                verified = true;
            }
            else {
                System.out.println("Incorrect Entry, try again.");
                verified = false;}
            } while(verified == false);


    }

    public static void displayData(String busname, String name, String phone){
        System.out.println("Business Name: "+busname+"\nName: "+name+"\nPhone: "+phone);
    }
    public static void displayData(String name, String phone)
    {
        System.out.println("Name: "+name+"\nPhone: "+phone);
    }
}
