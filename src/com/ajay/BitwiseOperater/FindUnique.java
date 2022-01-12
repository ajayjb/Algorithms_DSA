package com.ajay.BitwiseOperater;

public class FindUnique {
    public static void main(String[] args) {
        System.out.println(find(new int[] {2,3,4,1,2,1,3,6,4}));
    }
    static int find(int[] arr){
        int unique = 0;
        for (int num: arr) {
            unique = unique ^ num;
        }
        return unique;
    }
}
