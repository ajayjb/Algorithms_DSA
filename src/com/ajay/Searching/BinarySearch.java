package com.ajay;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,8,9,10};
        int found = binaryFunc(arr1, 5);
        System.out.println(found);
    }
    static int binaryFunc(int[] arr, int num){
        int s = 0;
        int e = arr.length - 1;
        while(e>=s){
//            int middle = (s+e)/2; or
              int middle = s + (e-s)/2;
            if (arr[middle]> num){
                e = middle-1;
            } else if (arr[middle]< num){
                s = middle+1;
            }else if (arr[middle] == num){
                return middle;
            }
        }
        return -1;
    }
}
