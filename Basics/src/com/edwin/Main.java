package com.edwin;

import java.awt.*;//pointer
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte age = 30;
        Date now = new Date();
        System.out.println(now);//current date time
        //System.out.println("topic1");


        byte x= 1;
        byte y= x;
        x=2;
       // System.out.println(y);
        Point address = new Point(1,2);
        Point address2 = address;
        //System.out.println("topic2");
        //System.out.println(address2);

        //System.out.print("Topic 3 Enter your name: ");
        Scanner s = new Scanner(System.in);
        //String message = s.nextLine();
        String message = "absss";
        //System.out.println(message.startsWith("E"));
        if (message.startsWith("E"))
        {
            System.out.println("Nice name");
        }
       // System.out.println(message.indexOf("ab"));
        //System.out.println(message.replace("s","a"));
        message = message.replace("s","a");

       // System.out.println(message);

        //System.out.println("topic 4" );
       // System.out.println("c:windows\\heheh\\yoyo");

       // System.out.println("topic5");
        int [][][] numbers= new int [2][4][8];
        numbers[0][0][0]=1;
        //Arrays.sort(numbers);//not return it changes origanl values
        //System.out.println( Arrays.deepToString(numbers));

        // System.out.println("topic6");
        final float pi = 3.14F; //must add F
        //final means contant
        // cant change value later
        //System.out.println(pi);

        // System.out.println("topic7");
        double num = (double)10/(int)3;
        //System.out.println(num);
        short x1= 7;
        int y1 = x1+10;//implicit casting, converted automedically
        //however, if we want to convert double to int
        double y2= 2.3 ;
        int x2= (int)y2;
        String y3= "3.9";
        int x3 = (int) Double.parseDouble(y3);
        //System.out.println(x3); will display 3, not 4
        //therefore, if we need to round up the number to 4;

        //Math.round() take double return long / take float return int
        x3= (int )Math.round(Double.parseDouble(y3)); //this function return long, so need (int)
        x3= Math.round(Float.parseFloat(y3));//this function return int, but takes float
       // System.out.println(x3);


        // System.out.println("topic8");
        double r1= Math.random();//this dunction return double
        //System.out.println(r1); //will display 0-1 with decimal
        //u cant (int) Math.random() because it will only dislay 0
        int r2= (int) Math.round(Math.random()*3+1);
        //System.out.println(r2); //display     1 - 4
        //random()*x == 0-x so if u want 1-x, u need to do random()*(x-1)+1

        // System.out.println("topic9 format");
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String money = currency.format(24424242.3232);
        //System.out.println(money); //$24,424,242.32
        NumberFormat percent   = NumberFormat.getPercentInstance();
        String p1 = percent.format(0.2222);
        //System.out.println(p1);//22%

        // System.out.println("topic9 input");
        //Scanner scanner = new Scanner(System.in);
       // System.out.print("int:");
       // int i1= scanner.nextInt();
        //System.out.print("string:");
        //String i2= scanner.next();//for this one, spacing would be a problem
        //i2= scanner.nextLine() ;//this one wouldnt;
        //i2 = scanner.nextLine().trim()//this one can get rid of the extra spacing






    }
}
