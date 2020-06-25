package com.edwin;

import java.util.Random;

public class Subtraction {
	int x, y;
	int []answer = new int [5];
	public int[] quiz() {
		createQuestion();//random number
		System.out.println("How much is " + x + "-" + y);
		System.out.println("Enter -1 to exit");
		System.out.print("Your answer: ");

		answer[0] = 2;
		answer[1] = x;
		answer[2] =y;
		answer[3] = x-y;
		answer[4] = 0;
		return answer;
	}



	public void createQuestion() {
		Random r = new Random();
		x = r.nextInt(10);
		y = r.nextInt(10);


	}

	public void checkResponse(int ans) {
		if (ans==-1){
			//nothing
		}else if (ans == (x - y)) {
			createResponse(true);
		} else
			createResponse(false);


	}
	public void createResponse(boolean result){
		Random r = new Random();
		int num = r.nextInt(4);
		if (result) {
			switch (num) {
				case 0:
					System.out.println("0Nice s");
					break;
				case 1:
					System.out.println("1Perfect s");
					break;
				case 2:
					System.out.println("2Good s");
					break;
				case 3:
					System.out.println("3Well Done s");
					break;
				default:
					System.out.println("wrong got into: " + num);
			}
		} else {
			switch (num) {
				case 0:
					System.out.println("0One more u wrong s");
					break;
				case 1:
					System.out.println("1No good s");
					break;
				case 2:
					System.out.println("2Try again s");
					break;
				case 3:
					System.out.println("3Almost s");
					break;
				default:
					System.out.println("wrong got into: " + num);
			}

		}
	}
}
