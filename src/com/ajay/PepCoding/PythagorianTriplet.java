package com.ajay.PepCoding;

public class PythagorianTriplet {
    public static void main(String[] args) {
        System.out.println(pythagorean(5,3,4));
    }
    static boolean pythagorean(int a, int b, int c){
        if(Math.pow(a,2) == Math.pow(b,2)+Math.pow(c,2)){
            return true;
        }
        if(Math.pow(b,2) == Math.pow(a,2)+Math.pow(c,2)){
            return true;
        }
        if(Math.pow(c,2) == Math.pow(a,2)+ Math.pow(b,2)){
            return true;
        }
        return false;
    }
}
