package com.edwin;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("The amount you want to get:");
        double amount = s.nextDouble();
        System.out.print("Interest rate in %:");
        double interest = s.nextDouble()/100/12;
        System.out.print("Paid in year:");
        double month = s.nextDouble()*12;

        double result = amount*interest;
        double d = Math.pow((1+interest),month);
        result = result* d;
        result = result/(d-1);
        //result = result/;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String output = currency.format(result);
        System.out.print("Monthly payment: ");
        System.out.println(output);
    }
}
