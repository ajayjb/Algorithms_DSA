package com.ajay.RecursionArrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        System.out.println(find_many(0, new int[] {5,5,7,9,9,7,1,2,63,54},9));
        System.out.println(find_many2(0, new int[] {5,5,7,9,9,7,1,2,63,54},9, new ArrayList(1)));
        System.out.println(find_many3(0, new int[] {5,5,7,9,9,7,1,2,63,54},9));
    }
    // Method 1
    static int search(int[] arr, int i, int target){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return search(arr, i+1, target);
    }
    // Method 2
    static boolean linear(int[] arr, int i, int target){
        if(i == arr.length){
            return false;
        }
        return arr[i]==target || linear(arr, i+1, target);
    }
    // Method 3
    static ArrayList<Integer> store = new ArrayList<>(1);
    static ArrayList find_many(int i, int[] arr, int target){
           if(i==arr.length){
               return store;
           }
           if(arr[i] == target){
               store.add(i);
           }
           return find_many(i+1, arr, target);
    }
    // Method 4
   static ArrayList<Integer> find_many2(int i, int[] arr, int target, ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return find_many2(i+1, arr, target, list);
   }
   // Method 5
    static ArrayList<Integer> find_many3(int i, int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<Integer>(1);
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> previous = find_many3(i+1, arr, target);
        list.addAll(previous);
        return list;
    }
}
