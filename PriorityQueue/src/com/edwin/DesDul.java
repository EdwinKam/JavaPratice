package com.edwin;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DesDul {
	private PriorityQueue <Double> q;
	private String output="";
	public DesDul(double[] arr){
		q = new PriorityQueue<Double>(new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return o2.compareTo(o1);
			}
		});
		for (double v : arr) {
			q.offer(v);
		}
		calculate();
	}

	public void calculate(){
		while(q.size() > 0){
			output=output+q.peek()+" " ;
			q.poll();
		}
	}
	public String toString() {
		return output;
	}

}
