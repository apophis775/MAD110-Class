package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int num = 0;
	    String numstring = "NULL";
	    Scanner in = new Scanner(System.in);


        System.out.println("Please enter a number from 0 to 10:");
        num = in.nextInt();

        switch(num){
            case 0: numstring= "0";
                break;
            case 1: numstring= "1";
                 break;
            case 2: numstring= "10";
                break;
            case 3: numstring= "11";
                break;
            case 4: numstring= "100";
                break;
            case 5: numstring= "101";
                break;
            case 6: numstring= "110";
                break;
            case 7: numstring= "111";
                break;
            case 8: numstring= "1000";
                break;
            case 9: numstring= "1001";
                break;
            case 10: numstring= "1010";
                break;
            default: numstring = "Outside Range";
                break;

        }
        System.out.println("Your number converted to Binary is: "+numstring);




    }
}
