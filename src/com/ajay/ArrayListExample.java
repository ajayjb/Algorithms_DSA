package com.ajay;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
//        ArrayList<Integer> List = new ArrayList<>(10);
//        for(int i=1; i<=10; i++) {
//            List.add(i);
//        }
////        System.out.println(List);
////        System.out.println(List.contains(69));
//        for(int i=0; i<10; i++) {
//            int x= List.get(i);
//            System.out.println(x);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);
              for(int i=0; i<3; i++){
                  list.add(new ArrayList<Integer>());
        }
              for(int i=0; i<3; i++){
                  for(int j=0; j<3; j++){
                      list.get(i).add(in.nextInt());
                  }
              }
//              for(ArrayList<Integer> arr: list){
//                  System.out.println(arr);
//              }
        System.out.println(list);
    }
}
