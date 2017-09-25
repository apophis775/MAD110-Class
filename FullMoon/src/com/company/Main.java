package com.company;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
	LocalDateTime current = LocalDateTime.now(); //Todays date
	LocalDateTime REFERENCEMOON = LocalDateTime.of(2017,3,12,10,54); //The reference moon used
	LocalDateTime nextmoon = REFERENCEMOON;
	double count = REFERENCEMOON.until(current, ChronoUnit.DAYS);
	count = count/29;

	for(int I = 0; I<count;I++)
    {nextmoon = nextmoon.plusDays(29);
    nextmoon= nextmoon.plusHours(12);
    nextmoon= nextmoon.plusMinutes(44);
    }




	System.out.println ("Current Date is: "+current);
	System.out.println ("Next Full Moon: " +nextmoon);
    }
}
