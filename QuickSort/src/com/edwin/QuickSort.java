package com.edwin;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	private int[]arr;
	public int size;
	Random r = new Random();
	QuickSort(String name){
		size=r.nextInt(90)+10;
		arr= new int[size];
		System.out.println(name+" is created.");
		for(int i=0; i<arr.length;i++){
			arr[i]=r.nextInt(190)+10;
		}
		System.out.println(Arrays.toString(arr));
	}
	public void sort(int left, int right){//left =leftmost cell, right=right most cell

		if(left<right){                                //array.length-1=right
			int pivot = (partition(left,right));
			sort(left,pivot-1);     //privot point already at its correct spot
			sort(pivot+1,right);       //but this right already array.length because its from int right
		}
	}
	private int partition(int left, int right){
		while(right>left){      //try from right first
			if(arr[left]>arr[right]){       //if the leftmost cell is bigger then anything from the right
				swap(left, right);
				left++;     //inc the cell we just swap because its on the right side already
				break;
			}
			right--;        //otherwise, right-- so we can try the next one
		}
		while(right>left){
			if(arr[left]>arr[right]){
				swap(left, right);
				right--;
				break;
			}
			left++;
		}
		if(left==right){
			return left;        //if left and right meet, then its the privot point final position
		}
		else{
			return partition(left,right);       //otherwise, keep going and pass the left and right to next method
		}
	}
	public String toString(){
		return Arrays.toString(arr);
	}

	public int getSize() {
		return size;
	}

	public int[] getArr() {

		return arr;
	}
	private void swap(int pivot, int i){
		int temp = arr[pivot];
		arr[pivot]=arr[i];
		arr[i]=temp;
	}
}
