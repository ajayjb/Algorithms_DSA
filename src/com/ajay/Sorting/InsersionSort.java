package com.ajay.Sorting;

import java.util.Arrays;

public class InsersionSort {
    public static void main(String[] args){
        int[] arr = {5,4,7,5,7,6,71,8,4,86,2,4,6,58,1,7,32,-54,-78};
        int[] nums = {};
        Insertion(arr);
        Insertion(nums);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
    }
    static void Insertion(int[] arr){
        for(int i=0; i<=arr.length-2;i++){
            for(int j=i+1; j>0; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] =temp;
                }
                else{
                    break;
                }
            }
        }
    }
}