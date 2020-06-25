package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Complex a = new Complex(9.5,7.7);
    Complex b = new Complex(1.2,3.1);
        System.out.println("A complex number in the form (x,y) is equal to x+yi, where i is square root of -1.");
        System.out.println("Complex numbers calculations");
        System.out.printf("a = %s\n", a.toString());
        System.out.printf("b = %s\n", b.toString());
        System.out.printf("a+b = %s\n", a.add(b).toString());
        System.out.printf("a-b = %s\n", a.subtract(b).toString());
        System.out.printf("a*b = %s\n", a.multiply(b).toString());
        System.out.printf("a/b = %s\n", a.division(b).toString());

    }
}
