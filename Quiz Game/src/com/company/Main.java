package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int correct = 0;
        String answer1 = new String();
        String answer2 = new String();
        String answer3 = new String();
        String answer4 = new String();
        String answer5 = new String();

        System.out.println("What is the name of the ship commanded by Jonathan Archer, James Kirk, and Jean Luc Picard?");
        answer1 = sc.nextLine();
        if (answer1.equalsIgnoreCase("enterprise")) {
            correct++;
            System.out.println("Correct");
        } else
            System.out.println("Wrong, the correct answer is Enterprise.");
        System.out.println("What is the capital of Lousianna?");
        answer2 = sc.nextLine();
        if (answer2.equalsIgnoreCase("baton rouge")) {
            correct++;
            System.out.println("Correct");
        } else
            System.out.println("Wrong, the correct answer is Baton Rouge.");
        System.out.println("Who is the main character of Breaking Bad?");
        answer3 = sc.nextLine();
        if (answer3.equalsIgnoreCase("walter white")) {
            correct++;
            System.out.println("Correct");
        } else
            System.out.println("Wrong, the correct answer is Walter White.");
        System.out.println("Who is the first name of the father on The Simpsons?");
        answer4 = sc.nextLine();
        if (answer4.equalsIgnoreCase("homer")) {
            correct++;
            System.out.println("Correct");
        } else
            System.out.println("Wrong, the correct answer is Homer.");
        System.out.println("What is the capital of Mexico?");
        answer5 = sc.nextLine();
        if (answer5.equalsIgnoreCase("mexico city")) {
            correct++;
            System.out.println("Correct");
        } else
            System.out.println("Wrong, the correct answer is Mexico City.");

        System.out.println("Final Score: " + correct);
    }
}
