package com.edwin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int input=0;
        do {
        System.out.println("Draw Triangles and Diamond shapes");
        System.out.println("Enter 1 to draw four separate triangles");
        System.out.println("Enter 2 to draw four triangle at the same row");
        System.out.println("Enter 3 to draw a diamond");
        System.out.println("Enter 4 to exit the program");
        System.out.print("Enter your choice: ");


            input = s.nextInt();
            switch (input) {
                case 1:
                    leftup();
                    System.out.println("");
                    leftdown();
                    System.out.println("");
                    rightdown();
                    System.out.println("");
                    rightup();
                    System.out.println("");
                    break;
                case 2:
                    sidetri();
                    break;
                case 3:
                    diamond(13);
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Please enter something between 1-4");

            }
        }while(input!=4);
    }
        public static void diamond(int row){
            int star=row/2+1;
            for (int i = 0; i<star ; i++) {
                for (int j = 0; j<star-i;j++){
                    System.out.print("/");
                }
                System.out.print("*");
                for(int j= 0; j<i; j++ )
                {
                    System.out.print("*");
                    System.out.print("*");
                }
                System.out.println("");
                }

            for (int i = 0; i<star-1;i++){
                for(int j=0; j<=i+1; j++){
                    System.out.print("/");
                }
                for(int j=0; j<row-2-i*2; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }


        }

        public static void leftup() {
            for (int i = 0; i < 10; i++) {

                for (int j = 0; j <= i; j++) {
                    System.out.print(j);
                }
                for (int j = 1; j < 10 - i; j++) {
                    System.out.print("/");
                }
                System.out.println("");
            }
        }
        public static void leftdown () {
            for (int i = 0; i < 10; i++) {

                for (int j = 0; j < 10 - i; j++) {
                    System.out.print(j);
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("/");
                }
                System.out.println("");
            }
        }

    public static void rightdown () {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void rightup () {
        for (int i = 0; i < 10; i++) {

            for (int j = 1; j < 10 - i; j++) {
                System.out.print("/");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
        public static void sidetri () {
            for (int i = 0; i < 10; i++) {

                for (int j = 0; j <= i; j++) {
                    System.out.print(j);
                }
                for (int j = 1; j < 10 - i; j++) {
                    System.out.print("/");
                }       //done first triangle

                System.out.print("\t");

                for (int j = 0; j < 10 - i; j++) {
                    System.out.print(j);
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("/");
                }       //done second triangle

                System.out.print("\t");

                for (int j = 0; j < i; j++) {
                    System.out.print("/");
                }
                for (int j = 0; j < 10 - i; j++) {
                    System.out.print(j);
                }       //done third triangle

                System.out.print("\t");

                for (int j = 1; j < 10 - i; j++) {
                    System.out.print("/");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(j);
                }       //done forth triangle


                System.out.println("");//next row
            }
        }
    }

