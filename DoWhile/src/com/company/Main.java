package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean valid = false;
        Scanner scanner = new Scanner(System.in);
        Integer selection = 0;
        do {
            System.out.println("Shall we play a game?");
            System.out.println("1. Chess");
            System.out.println("2. Poker");
            System.out.println("3. Tic Tac Toe");
            System.out.println("4. Global Thermonuclear War");
            selection = scanner.nextInt();
            if(selection < 1 || selection >4){
                System.out.println("Incorrect choice");
                valid = false;}
            else if (selection ==4){
                System.out.println("Wouldn't you prefer a nice game of Chess?");
                valid = false;}
            else{
                System.out.println("Launching game...");
                valid = true;}

        } while (valid == false);
    }
}
