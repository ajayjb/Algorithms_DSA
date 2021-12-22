package com.ajay;

public class PeakMountainArrayLeetcode852 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 12, 9, 7, 5, 2};
        System.out.println(peakBinary(nums));
        System.out.println(peakLinear(nums));
    }

    // log(n) binary approach
    static int peakBinary(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (end > start) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // o(n) linear search
    static int peakLinear(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] < arr[i]) {
                return i;
            }
        }
        return  -1;
    }
}


