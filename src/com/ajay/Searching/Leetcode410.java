package com.ajay;
// Split Array
public class Leetcode410 {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        System.out.println(Find(nums, 3));
    }
     static int Find(int[] arr, int m){
        int start = 0;
        int end = 0;
        for(int num: arr){
            end = end + num;
            start = Math.max(start,num);
        }
        while(end>start){
            int mid = start + (end-start)/2;
            int sum = 0;
            int count = 1;
            for (int num: arr){
                if (sum+num>mid){
                    sum = num;
                    count++;
                }
                else{
                    sum = sum +num;
                }
            }
            if (count <= m){
                end = mid;
            }
            else if (count > m){
                start = mid +1;
            }
        }
        return start;
    }
}
