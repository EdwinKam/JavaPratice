package com.edwin;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            method1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void method1()throws Exception{
        try{
        method2();
        }
        catch(Exception e){
           System.out.println(e.getMessage());
        throw e;
            }
    }
    static void method2() throws Exception{
       //throw new Exception("Exception thrown in method 2");
        System.out.print("Enter something: ");
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        if (x<10)
            throw new Exception("too small");

    }
}
