package com.ajay.RecusionLevel1;

public class Nto1 {
    public static void main(String[] args) {
        printRev(10);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    static void printRev(int n){
        if(n==0){
            return;
        }
        printRev(n-1);
        System.out.println(n);
    }
}
