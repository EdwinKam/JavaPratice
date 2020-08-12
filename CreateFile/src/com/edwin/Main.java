package com.edwin;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static  File name=null;
    public static PrintWriter writer;
    public static void main(String[] args) {
	// write your code here
        try{
            name = new File("haha.txt");
            if(!name.exists()){
                name.createNewFile();
            }
            writer =new PrintWriter(name);
        }catch(Exception e){
            System.out.println("You got some errors");
            System.exit(0);
        }
        writer.print("hahaha");
        writer.close();


    }
}
