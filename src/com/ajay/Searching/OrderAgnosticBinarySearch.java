package com.ajay;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {10,8,4,3,2,1};
        int found = binarySearch(arr1, 4);
        System.out.println(found);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAcc = arr[0]<arr[arr.length-1];
        while(end>=start){
            int middle = start+end/2;
            if (arr[middle] == target){
                return  middle;
            }
            if (isAcc){
                if (target < arr[middle]){
                    end = middle - 1;
                }else if(target>arr[middle]){
                     start = middle + 1;
                }
            }else{
                if (target < arr[middle]){
                    start = middle + 1;
                }else if(target>arr[middle]){
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}
