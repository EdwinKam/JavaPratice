package com.edwin;

import java.util.Arrays;

public class Main {
    public static int  [] array = {5,2,7,1,84,8,3,7,34,6,4,6,7,3,3,0,3,4,};
    public static int left =0,right =array.length;
    public static void main(String[] args) {
	// write your code here

        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void sort(int [] arr){
        int intright=right;
        for(int i= right-1; i>left; i--){     //check from right
            if (arr[left]>arr[i]){
                int temp = arr[left];       //until less than left is found
                arr[left]=arr[i];
                arr[i]=temp;
                right = i;
                break;
            }
        }
        if(intright==right){    //if nothing int the right smaller than right
           // left=right+1;
        }
        int intleft=left;
        for(int i = left+1; i<right;i++ ){      //check from left
            if (arr[i]>arr[right]){
                int temp = arr[i];
                arr[i]=arr[right];          //until greater than right is found
                arr[right]=temp;
                left = i;
                break;
            }
        }
        if(intleft==left){
            System.out.println(right);
            System.out.println(left);
            return;
        }
        sort(arr);

    }
}
