package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	    Double totalBill;
	    Double tax = 0.25;
	    Double tip = 0.17;
	    Double finalcost= 0.0;
	    Double tipped = 0.0;
		DecimalFormat df = new DecimalFormat("#.##");
		df.setMaximumFractionDigits(2);


	    System.out.println("How much was the bill?");
	    totalBill = sc.nextDouble();
	    totalBill = totalBill+ (totalBill*tax);
	    tipped = totalBill*tip;
	    finalcost = totalBill+tip;
	   // finalcost = (double) Math.round((finalcost*100) /100);
       // tip = (double) Math.round((tip*100)/100);
		System.out.println("Bill: " +totalBill);
        System.out.println("Suggested Tip: $"+df.format(tipped));
        System.out.println("Total cost with tip: $"+df.format(finalcost));

    }
}
