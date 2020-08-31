package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s =  new Solution();
        int num[]= {0};
        System.out.println(s.canJump(num));

    }
}
class Solution {
    public boolean canJump(int[] nums){
        int zero=-1;
        int currentIndex = nums.length-1;
        while(currentIndex>=0){
            if(zero>=0){
                if(nums[currentIndex]+currentIndex>zero){
                    zero=-1;
                }
            }else if (zero==-1){
                if(nums[currentIndex]==0){
                    if(currentIndex!=nums.length-1){
                        zero=currentIndex;
                    }
                }
            }
            currentIndex--;
        }
        return(zero==-1);
    }
    public boolean canJump1(int[] nums) {
        int currentIndex = nums.length-1;
        int zero=-1;
        int pass=-1;
        while (currentIndex >= 0) {

            if(zero>0){
                if(currentIndex+nums[currentIndex]>zero)
                {
                    pass=currentIndex;
                    zero=-1;
                }
            }
            else if(pass!=-1){
                if(currentIndex+nums[currentIndex]>=pass){
                    pass=currentIndex;
                }
            }
            else if(zero==-1){//if zero never been assign
                if(nums[currentIndex]==0) {
                    if(currentIndex==nums.length-1){
                        pass=currentIndex;
                    }else
                    zero = currentIndex;//pass to 0value index
                }
            }
            currentIndex--;

        }
        return (pass==0||(pass==-1&&zero==-1)||nums.length==1);
    }
    public boolean canJump(int[] nums, int jump, int currentIndex){
        currentIndex=jump+currentIndex;
        if(currentIndex>=nums.length-1){
            return true;
        }

        for (int i = nums[currentIndex]; i > 0; i--) {
            if (canJump(nums, i, currentIndex))
                return true;
           }

        return false;
    }
}