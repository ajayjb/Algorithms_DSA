package com.ajay;

public class BinaryProblemCeilNumber {
    public static void main(String[] args) {
         int[] arr = {2,5,7,18,25,50,59,65,99,114};
         System.out.println(cielBinary(arr, 7));
    }

    static int cielBruteForce(int[] arr, int target){
        for(int num: arr) {
            if (num == target){
                return target;
            }
            else if(num>target){
                return num;
            }
        }
        return Integer.MAX_VALUE;
    }

    static int cielBinary(int[] arr, int target){
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
//        if (arr[m]>target){
//            return arr[m];
//        }else {
//            return arr[m+1];
//        }
        return arr[l];
    }
}
