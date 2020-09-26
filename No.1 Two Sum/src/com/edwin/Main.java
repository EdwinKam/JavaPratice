package com.edwin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {3,2,4};
        solution s = new solution();
        System.out.println(Arrays.toString(s.twoSum(nums,6)));
    }
}
class solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

     for(int i=0;i<nums.length;i++){
         int remain=target-nums[i];
         if(map.containsKey(remain)&&map.get(remain)!=i){
             return new int[]{i,map.get(remain)};
         }
         map.put(nums[i],i);//put anything in hashmap
        }
     return null;
    }
}
