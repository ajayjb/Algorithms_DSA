package com.ajay;

public class SquarerootUsingBS {
    public static void main(String[] args) {
        System.out.println(SquareRoot(10));
    }
    static double SquareRoot(int num){
        double start = 1;
        double end = num;
        double mid = 1;
        while((end-start>0.001)){
            mid = start + (end-start)/2;
            if(mid*mid == num){
                return  mid;
            }
            else if(mid*mid < num){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        return mid;
    }
}
