package com.edwin;

import java.util.Collections;
import java.util.PriorityQueue;

public class AscDul {
	private PriorityQueue<Double>q;//without indication, default capcity would be 11
	private String output="";
	AscDul(double[] arr){
		q= new PriorityQueue<>();
		for (double v : arr) {
			q.offer(v);
		}
		calculate();
	}
	public void calculate(){
		while(!q.isEmpty()){
			output=output+q.peek()+" " ;
			q.poll();
		}
	}
	public String toString() {
		return output;
	}
}
