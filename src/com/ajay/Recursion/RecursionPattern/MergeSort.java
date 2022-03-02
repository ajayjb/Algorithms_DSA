package com.ajay.Recursion.RecursionPattern;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[] {7,5,24,8,1,3,16,20})));
        int[] arr = new int[] {7,5,24,8,1,3,16,20};
        sortInPlace(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // Sort Outplace (using external array)

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int[] hostArr = new int[left.length+right.length];
        int l = 0;
        int r = 0;
        int k = 0;
        while(l<left.length && r<right.length){
            if(left[l]<right[r]){
                hostArr[k] = left[l];
                k++;
                l++;
            }
            else{
                hostArr[k] = right[r];
                k++;
                r++;
            }
        }
        while(l<left.length){
            hostArr[k] = left[l];
            l++;
            k++;
        }
        while(r<right.length){
            hostArr[k] = right[r];
            r++;
            k++;
        }
        return hostArr;
    }

    // Sort in place (Modifying the same array)

    static void sortInPlace(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;
        sortInPlace(arr,start, mid);
        sortInPlace(arr, mid+1, end);
        conquer(arr, mid, start, end);
    }

    static void conquer(int[] arr,int mid,int start, int end){
        int[] hostArr = new int[end-start+1];
        int k = 0;
        int another = mid+1;
        int s = start;
        while(s<=mid && another<=end){
            if(arr[s]<arr[another]){
                hostArr[k] = arr[s];
                k++;
                s++;
            }else{
                hostArr[k] = arr[another];
                another++;
                k++;
            }
        }
        while (s<=mid){
            hostArr[k] = arr[s];
            k++;
            s++;
        }
        while (another<=end){
            hostArr[k] = arr[another];
            k++;
            another++;
        }
        int j = 0;
        for(int i=start; i<=end;i++){
            arr[i] = hostArr[j];
            j++;
        }
    }
}
