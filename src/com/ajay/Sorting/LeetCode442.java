package com.ajay.Sorting;

import java.util.ArrayList;

public class LeetCode442 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2, 3};
        Sort(arr);
        ArrayList<Integer> duplicate = new ArrayList<Integer> (2);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                duplicate.add(arr[i]);
            }
        }
        System.out.println(duplicate);
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
