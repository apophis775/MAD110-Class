package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Float temperature = 98.2f;
	    Scanner scanner = new Scanner(System.in);
        Boolean valid = false;

	    while(!valid){
	        System.out.println("Enter a temperature: ");
	        temperature = scanner.nextFloat();
	        if(temperature < 97.5){
	            System.out.println("Temperature is Low");
	            valid = true;}
            else if (temperature >=97.5 && temperature <=99.5){
                System.out.println("Temperature is Normal");
                valid = true;}
            else if (temperature > 99.5){
                System.out.println("Temperature is High");
                valid = true;}
            else{
                System.out.println("Invalid Temperature");
                valid = false;}

        }


    }
}
