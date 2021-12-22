package com.ajay;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        int x = 445;
        for(int i=0; i<=10 ; i++){
            x = x+i;
            System.out.println(x);
        }
        fun(1,2,5,7,8,2,2,8,2);
    }
    static void fun(int ...v){
        int x = 55;
        System.out.println(Arrays.toString(v));
        System.out.println(x);
    }
}






























