package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] menu = new String[5];
        Integer[] inventory = new Integer[5];
        menu[0] = "Hot Dog";
        menu[1] = "Hamburger";
        menu[2] = "Sandwich";
        menu[3] = "Pizza";
        menu[4] = "Soup";

        inventory[0] = 5;
        inventory[1] = 5;
        inventory[2] = 5;
        inventory[3] = 5;
        inventory[4] = 5;

        Integer choice;
        Integer choice2;

        System.out.println("Make an Inventory Selection: ");
        for(int i = 0;i<5;i++)
        {
            System.out.println((i+1)+". "+menu[i]+"   Number: "+inventory[i]);
        }
        choice = selectINV();
        System.out.println("Do you want to Add(1) or Subtract(2)?");
        choice2 = AddOrSub();
        int newtotal = inventory[choice]+choice2;
        while (newtotal < 0)
        {
            System.out.println("Error, you will go negative with your stock, try again");
            newtotal = sc.nextInt();
        }
        System.out.println("Processing..."+"\nOriginal amount of "+menu[choice]+" was "+inventory[choice]+".  The amount of the change is "+choice2+" and the new total is "+newtotal);
        inventory[choice]= newtotal;





    }

    public static int selectINV()
    {
        int num = sc.nextInt();
        while(num>5 || num<1)
        {
            System.out.println("Incorrect Entry, try again:");
            num = sc.nextInt();
        }
        num--;
        return num;

    }
    public static int AddOrSub()
    {
        int num = sc.nextInt();
        while(num<1 || num>2)
        {
            System.out.println("Incorrect Entry, try again:");
            num = sc.nextInt();
        }
        System.out.println("By How much?");
        int amount = sc.nextInt();
        if(num == 2)
            amount*=-1;
        return amount;
    }
}
