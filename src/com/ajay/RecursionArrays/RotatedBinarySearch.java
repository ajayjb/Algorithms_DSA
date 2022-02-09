package com.ajay.RecursionArrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[] {5,6,7,1,2,3,4}, 4, 0, 6));
    }
    static int search(int[] arr, int target , int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target<arr[mid] && target>=arr[s]){
                return search(arr, target, s, mid-1);
            }else{
                return search(arr, target,mid+1, e);
            }
        }
        if(target>arr[mid] && target<=arr[e]){
            return search(arr, target, mid+1, e);
        }
        return search(arr, target, s,mid-1);
    }
}
