package com.ajay.Sorting;

public class leetCode41 {
    public static void main(String[] args) {
        System.out.println(find(new int[] {3,4,-1,1}));
    }
    static void Sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                  Swap(nums, i, correct);
            }else{
                i++;
            }
        }
    }

    static int find(int[] nums){
        Sort(nums);
        for (int i=0; i< nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return (nums.length+1);
    }

    static void Swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
