package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Make a choice:"+"\n1. Square"+"\n2. Circle"+"\n3. Triangle"+"\n4. Rectangle");
        int choice = sc.nextInt();

        switch(choice){
            case 1: Square();
                break;
            case 2: Circle();
                break;
            case 3: Triangle();
                break;
            case 4: Rectangle();
                break;
            default:
                System.out.println("You Chose... Poorly...");
                break;

        }

    }
    public static void Square()
    {
        double length;
        double area;
        System.out.println("What is the length of the sides?");
        length = sc.nextDouble();
        area= length*length;
        System.out.println("The area of the Square is "+area);
        return;
    }

    public static void Circle()
    {
        double radius;
        double area;
        System.out.println("What is the radius?");
        radius = sc.nextDouble();
        area= (radius*radius)*3.14;
        System.out.println("The area of the Square is "+area);
        return;
    }

    public static void Triangle()
    {
        double base;
        double height;
        double area;
        System.out.println("What is the length of the base?");
        base = sc.nextDouble();
        System.out.println("What is the height?");
        height = sc.nextDouble();
        area= base*height*0.5;
        System.out.println("The area of the Triangle is "+area);
        return;
    }

    public static void Rectangle()
    {
        double width;
        double height;
        double area;
        System.out.println("What is the Width?");
        width = sc.nextDouble();
        System.out.println("What is the height?");
        height = sc.nextDouble();
        area = width * height;
        System.out.println("The area of the Rectangle is "+area);
        return;
    }

}


