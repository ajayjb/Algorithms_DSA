package com.ajay.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode448 {
    public static void main(String[] args) {
        ArrayList<Integer> missing = new ArrayList<Integer>(1);
        int[] nums = {4,3,2,7,8,2,3,1};
        for(int i=0; i<nums.length;i++){
            if(nums[i] != i+1){
                missing.add(i+1);
            }
        }
        System.out.println(missing);
    }
    static void Sort(int[] nums){
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
    }
}
