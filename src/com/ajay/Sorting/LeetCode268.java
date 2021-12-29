package com.ajay.Sorting;

import java.util.ArrayList;

public class LeetCode268 {
    public static void main(String[] args) {
        int [] arr = {1,5,4,3,0};
        System.out.println(Find(arr));
    }
    static void Sort(int[] nums){
        int i = 0;
        while(i<nums.length){
            if(nums[i] == nums.length){
                i++;
            }else if(nums[i] != i){
                int index = nums[i];
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }else{
                i++;
            }
        }
    }
    static int Find(int[] nums){
        Sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}
