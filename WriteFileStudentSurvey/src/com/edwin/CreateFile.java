package com.edwin;

import java.util.Formatter;

public class CreateFile {
	private Formatter x;
	CreateFile(String filename){//open file in constructor
		openFile(filename);
	}

	public void openFile(String filename){//create file
		try{
			x= new Formatter(filename);
		}catch(Exception e){
			System.out.println("You have an error!");
			System.exit(0);
		}
	}
	public  void record(int number){
		x.format(Integer.toString(number));
	}
	public  void recordString(String string){
		x.format(string);
	}
	public void close(){
		x.close();
	}

}
