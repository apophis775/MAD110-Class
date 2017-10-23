
package com.company;


        import java.time.*;
        import java.time.format.DateTimeFormatter;
        import java.time.temporal.ChronoUnit;
        import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // to get user input
        LocalDate today = LocalDate.now(); // to get current date / time

        // set date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        // display today's date formatted
        String textToday = today.format(formatter);
        System.out.println("Today's date is: " + textToday);

        // get info from user
        System.out.println("What month were you born in? (Enter as number: January = 1)");
        int myMonth = scanner.nextInt();
        while(myMonth>12 || myMonth<1){
            System.out.println("That's not a month!  Enter Again (1-12)");
            int myMonth = scanner.nextInt();
        }
        System.out.println("What day were you born? ");


        //ADD ERROR CHECKING FOR DAYS DEPENDING ON THE MONTH
        //ADD ERROR CHECKING FOR LEAP YEARS


        int myDay = scanner.nextInt();
        int myYear = today.getYear(); // assign year to current year
        int thisMonth = today.getMonthValue();

        // assign information to variable birthday
        LocalDate birthday = LocalDate.of(myYear,myMonth,myDay);


        // if birthday already happened this year, add one to year
        if (birthday.isBefore(today)){
            birthday = birthday.plusYears(1);
        }


        String nextBirthday = birthday.format(formatter);
        // calculate days till next birthday

        long daysToBirthday = today.until(birthday, ChronoUnit.DAYS);

        if (myMonth == thisMonth && myDay == today.getDayOfMonth() ){
            System.out.println("Happy Birthday!");
        }
        else {
            System.out.println("Your next birthday is: " + nextBirthday);
            System.out.println("There are " + daysToBirthday + " days till your next birthday!");
        }

    }
}

