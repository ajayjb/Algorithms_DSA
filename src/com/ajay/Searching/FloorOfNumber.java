package com.ajay;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,7,18,25,50,59,65,99,114};
        System.out.println(floorBinary(arr, 10));
    }
    static int floorBinary(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;
        int m = (r+l)/2;
        while(r>=l){
            m = (r+l)/2;
            if (target<arr[m]){
                r = m-1;
            }
            else if(target>arr[m]){
                l = m+1;
            }
            else if(target == arr[m]){
                return arr[m];
            }
        }
        return arr[r];
    }
}
