package com.edwin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        CreateFile c = new CreateFile("number.txt");
        Scanner s= new Scanner(System.in);
        //c.openFile();//create file first
        int input=0;
        do{
            System.out.print("Input a number 1-5, (-1 to exit): ");
            try{
                input=s.nextInt();
            }catch (Exception e){
                //System.out.println("Please enter something that's between 1-5");
                String ex= s.next();
            }
            if(input>0&&input<6){//if its 1-5
                c.record(input);//then put it in file
            }
            else if(input==-1){}//end loop
            else{
                System.out.println("Please enter something that's between 1-5");
            }

        }while(input!=-1);
        c.close();//close number.text
        ReadClass r;
        try {
            r = new ReadClass();//start to read
            r.output();
        }catch (Exception e){
            System.out.println("error");//if cant find the file
        }



    }
}
