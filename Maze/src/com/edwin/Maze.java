package com.edwin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Maze {
    public static void main(String[] args) {
        // write your code here
        input();        //recursive method

    }
    public static void input() {
        CreateMaze auto;        //delcare auto object here and the object will get change in the loop
        Scanner s = new Scanner(System.in);
        System.out.println("1. Step by Step");
        System.out.println("2. Auto");
        System.out.println("3. Exit");
        System.out.print("Your choice: ");
        int user=0;
        try {
            user = s.nextInt();
        }catch (Exception e){
            input();
        }
        switch (user){
            case 1:
                System.out.print("Input height: ");
                int height = s.nextInt();
                System.out.print("Input width: ");
                int width = s.nextInt();
                CreateMaze c = new CreateMaze(height,width);    //this constructor take (v,h)
                if(c.traverseMaze(c.getVin(), c.getHin())){     //if return true then success
                    System.out.println("congrats");
                }else{
                    System.out.println("88");       //false then no way to get out
                }
                input();        //if that maze cant get out, will ask for input again
                break;
            case 2:
                System.out.println("Genarating 10 maze");
                for (int i=0; i<10; i++){
                    System.out.println((i+1)+" maze");
                     auto= new CreateMaze();
                    if(auto.autoMaze(auto.getVin(), auto.getHin())){
                        System.out.println(auto);
                        System.out.println("congrats");
                    }else{
                        System.out.println(auto);
                        System.out.println("88");
                    }
                }
                input();
                break;
            case 3: System.exit(0);
            default:input();
    }
    }
}
