package com.edwin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CreateReadFile c = new CreateReadFile();
        c.openFile("haha.txt");
        c.recordString("yyyy");
        c.close();      //must close or u dont get anything saved
        c.readFile("C:/Users/kamsh/Documents/Git.mine/JavaPratice/ReadWriteFile/haha.txt");
        System.out.println(c.next());
    }
}
class CreateReadFile{
    private Formatter x;

    public void openFile(String filename){//create file
        try{
            x= new Formatter(filename);
        }catch(Exception e){
            System.err.println("You have an error!");
            System.exit(0);

        }
    }
    public  void record(int number){
        x.format(Integer.toString(number));
    }
    public  void recordString(String string){
        x.format(string);
    }
    public void close(){x.close();}
    private Scanner s;
    private File file = null;
    public void readFile(String location){
        try {
            file = new File(location);  //location need to be something like C:/user/number.txt
            s = new Scanner(file);
        }catch (FileNotFoundException e){
            System.err.println("File not found");
            System.exit(0);
        }
    }
    public String nextLine(){
        return s.nextLine();
    }
    public boolean hasNextLine(){
        return s.hasNextLine();
    }
    public int nextInt(){
        return s.nextInt();
    }
    public String next(){
        return s.next();
    }

}
class CreateFile{
    private Formatter x;
    CreateFile(String filename){
        openFile(filename);
    }
    public void openFile(String filename){//create file
        try{
            x= new Formatter(filename);
        }catch(Exception e){
            System.err.println("You have an error!");
            System.exit(0);

        }
    }
    public  void record(int number){
        x.format(Integer.toString(number));
    }
    public  void recordString(String string){
        x.format(string);
    }
    public void close(){x.close();}
}
class ReadFile{
    private Scanner s;
    private File file = null;
    ReadFile(String location){
        try {
            file = new File(location);  //location need to be something like C:/user/number.txt
            s = new Scanner(file);
        }catch (FileNotFoundException e){
            System.err.println("File not found");
            System.exit(0);
        }
    }
    public String nextLine(){
        return s.nextLine();
    }
    public boolean hasNextLine(){
        return s.hasNextLine();
    }
    public int nextInt(){
        return s.nextInt();
    }
    public String next(){
        return s.next();
    }
}

