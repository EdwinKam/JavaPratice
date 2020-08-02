package com.edwin;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadClass {

	Scanner s;
	CreateFile c = new CreateFile("output.txt");
	ReadClass()throws Exception{
		File file = new File("/C:/Users/kamsh/Documents/Git.mine/JavaPratice/WriteFileStudentSurvey/number.txt");
		s = new Scanner(file);

	}
	public void output() {//remember everything in class must in inside a method
		c.recordString("Rate:      Frequency:\n");
		int[] frequency = new int[5];
		String text="";
		while(s.hasNextLine()){
			text = text+s.nextLine();
		}
		for(int i = 0; i<text.length();i++){
			switch(text.charAt(i)){
				case '1':frequency[0]++;
					break;
				case '2':frequency[1]++;
					break;
				case '3':frequency[2]++;
					break;
				case '4':frequency[3]++;
					break;
				case '5':frequency[4]++;
					break;
				default:
					System.err.println("error, something not between 1-5 in the file\n");
					break;

			}
		}
		c.recordString("\n1:        "+frequency[0]);
		c.recordString("\n2:        "+frequency[1]);
		c.recordString("\n3:        "+frequency[2]);
		c.recordString("\n4:        "+frequency[3]);
		c.recordString("\n5:        "+frequency[4]);
		c.close();

	}


	}





