package com.ajay.General;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int [] arr = new int[5];
          String[] arr1 = {"adasa", "sfsdfs", "dfsdfs"};
          for(int i=0; i<arr.length ; i++){
                arr[i] = in.nextInt();
          }
//        for (String num : arr1) {
//            System.out.println(num);
//        }
        System.out.println(Arrays.toString(arr1));
    }
}
