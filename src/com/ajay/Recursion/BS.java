package com.ajay.Recursion;

public class BS {
    public static void main(String[] args) {
         int[] arr = {14,7,88,99,100,555,1000,1111, 1222, 1588};
        System.out.println(Search(arr, 99,0,arr.length-1));
    }
    static int Search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return Search(arr, target, start,mid-1);
        }else {
            return Search(arr, target, start = mid+1,end);
        }
    }
}
