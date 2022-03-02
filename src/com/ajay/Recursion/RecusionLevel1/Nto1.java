package com.ajay.Recursion.RecusionLevel1;

public class Nto1 {
    public static void main(String[] args) {
        printRev(20);
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
        if(n%2==0){
            System.out.println(n);
        }
    }
    static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
}
