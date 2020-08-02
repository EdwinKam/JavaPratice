package com.edwin;

import java.util.PriorityQueue;

public class AscNon {
	private PriorityQueue<Double> q;//without indication, default capcity would be 11
	private String output="";
	AscNon(double[] arr){
		q= new PriorityQueue<>();
		for (double v : arr) {
			q.offer(v);
		}
		calculate();
	}
	public void calculate(){
		double check=q.peek()-1;//check to to check if the number is the same as the previsous one
		//i set it to peek -1 so the first number will never repeat
		while(!q.isEmpty()){
			if(q.peek()!=check) {
				output = output + q.peek() + " ";
			}
			check=q.peek();//reset check
			q.poll();
		}
	}
	public String toString() {
		return output;
	}
}
