package com.edwin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        Decrypt d = new Decrypt();
        System.out.print("Enter the code you want to encrypt or decrypt:");
        String userinput = s.nextLine();

        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.print("Your choice is: ");
        int choice = s.nextInt();
        switch (choice){
            case 1: {
                System.out.print("The encrypted string would be : ");
                System.out.println(d.encryption(userinput));

            }
            break;
            case 2: {
                System.out.print("The decrypted string would be : ");
                System.out.println(d.decryption(userinput));

            }break;
            default:
                System.out.println("Enter 1 or 2");
                break;
        }



    }
}
