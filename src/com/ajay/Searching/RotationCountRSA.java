package com.ajay;
// Number rotation in rotated sorted Array
public class RotationCountRSA {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,8};
        System.out.println(RotaionCount(nums));
    }
    // To find Pivot about a rotated sorted Array.
    static int Pivot(int[] arr){
        int start = 0;
        int end  = arr.length - 1;
        while(end>start){
            int mid = start + (end-start)/2;
            if (mid<end && arr[mid] > arr[mid+1]){
                return  mid;
            }
            else if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else if (arr[start] < arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
    // To find number of Roations
    static int RotaionCount(int[] arr){
        return Pivot(arr)+1;
    }
}
