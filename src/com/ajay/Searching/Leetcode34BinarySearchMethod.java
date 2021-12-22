package com.ajay;

import java.util.Arrays;

public class Leetcode34BinarySearchMethod {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
         System.out.println(Arrays.toString(SearchRange(nums, 5)));
    }
    static int SearchIndex(int[] arr, int target, boolean startIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(end>=start){
            int mid = start + ((end - start)/2);
            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end  = end -1;
            }
            else if(target == arr[mid]){
                ans = mid;
                if (startIndex == true){
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    static int [] SearchRange(int[] arr, int target){
        int start = SearchIndex(arr, target, true);
        int last = SearchIndex(arr, target, false);
        return new int [] {start, last};
    }
}
