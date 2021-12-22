package com.ajay;

import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {5,7,9,10,11,54,100};
        System.out.println(Chunk(nums, 5));
    }
    static  int Binary(int[] arr, int target, int start, int end){
        while(end>=start){
            int mid = start + (end-start)/2;
            if (target > arr[mid]){
                start = mid+1;
            }
            else if (target < arr[mid]){
                end = end - 1;
            }
            else if (target == arr[mid]){
                return  mid;
            }
        }
        return  -1;
    }
  static int Chunk(int [] arr, int target) {
      int start = 0;
      int end = 1;
      int k = 2;
      while (target > arr[end]) {
//        int temp = start;
          start  = end + 1;
//        end = end + (end - start +1)*2; or you can use this remove k and use end = end + (end - start + 1);
//        end = end + (end - start + 1);
          end = end + (int)(Math.pow(2, k));
          k++;
//        start = temp;
      }
      return  Binary(arr, target, start, end);
  }
}
