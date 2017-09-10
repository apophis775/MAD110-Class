package com.company;

public class Main {

    public static void main(String[] args) {
	int var1 = 0;
	int var2 = 0;
	int total = 0;

	var1 = 5;
	var2 = 5;
    total=var1+var2;
    if(total==10)
        System.out.println(""+var1+"+"+var2+"="+total+" is true.");

    else
        System.out.println("Something went horrifically wrong.");
    var1=10;
    var2=5;
    total=var1-var2;
    if(total==5)
        System.out.println(""+var1+"-"+var2+"="+total+" is true.");

    else
        System.out.println("Something went horrifically wrong.");

    var1=5;
    var2=5;
    total=var1*var2;
    if(total==25)
        System.out.println(""+var1+"*"+var2+"="+total+" is true.");

    else
        System.out.println("Something went horrifically wrong.");

    var1=25;
    var2=5;
    total=var1/var2;
    if(total==5)
        System.out.println(""+var1+"/"+var2+"="+total+" is true.");

    else
        System.out.println("Something went horrifically wrong.");

    var1=10;
    var2=5;
    total=var1%var2;
    if(total==0)
        System.out.println(""+var1+"%"+var2+"="+total+" is true.");

    else
        System.out.println("Something went horrifically wrong.");





    }
}
