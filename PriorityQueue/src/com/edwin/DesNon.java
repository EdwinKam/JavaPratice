package com.edwin;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DesNon {
	private PriorityQueue<Double> q;
	private String output="";
	public DesNon(double[] arr) {
		q= new PriorityQueue<Double>(new Comparator <Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return o2.compareTo(o1);
			}
		});
		for (double v : arr) {
			q.offer(v);//plug arr value into priority queue
		}
		calculate();
	}
	public void calculate(){
		double check = q.peek()-1;
		while(!q.isEmpty()){
			if(check!=q.peek()){
				output=output+q.peek()+" ";
			}
			check=q.peek();
			q.poll();
		}
	}
	public String toString(){
		return output;
	}

}
