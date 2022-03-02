package com.ajay.Recursion.RecursionPattern;

public class RecursionPattern {
    public static void main(String[] args) {
//           pattern1(0,4);
           pattern2(0,4);
//             pattern3(0,4);
    }

    static void pattern1(int c, int r){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            pattern1(c+1, r);
        }
        else{
            System.out.println();
            pattern1(0, r-1);
        }
    }

    static void pattern2(int c, int r){
        if(r==0){
            return;
        }
        if(c<r){
            pattern2(c+1, r);
            System.out.print("* ");
        }
        else{
            pattern2(0, r-1);
            if(r!=1) {
                System.out.println();
            }
        }
    }

    static void pattern3(int c, int r){
        if(c==r){
            return;
        }
        for (int i=0; i<=c; i++){
            System.out.print("* ");
        }
        System.out.println();
        pattern3(c+1, r);
    }
}
