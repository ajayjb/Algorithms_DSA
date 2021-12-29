package com.ajay.Sorting;

public class LeetCode287 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        Sort(arr);
        int duplicate = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                duplicate = arr[i];
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
