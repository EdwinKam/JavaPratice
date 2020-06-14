package com.edwin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num[] = new int [3];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        num[0] = s.nextInt();
        System.out.print("Enter second integer: ");
        num[1] = s.nextInt();
        System.out.print("Enter third integer: ");
        num[2] = s.nextInt();
        System.out.println("For the numbers "+ num[0] +", "+num[1]+", "+num[2]);
        Arrays.sort(num);


        System.out.println("The max number is: "+ num[num.length-1]);
        System.out.println("The smallest number is: "+ num[0]);
        System.out.println("The median is: "+ num[num.length/2]);
        System.out.println("The range is: "+ (num[num.length-1]-num[0]));

        int sum=0;
        for(int i=0; i<num.length; i++){
            sum+=num[i];
        }
        System.out.println("The sum is: "+ sum);

        int product=1;
        for(int i=0; i<num.length; i++){
            product*=num[i];
        }
        System.out.println("The product is: "+ product);
        System.out.println("The average is: "+ (sum/num.length));
    }
}
