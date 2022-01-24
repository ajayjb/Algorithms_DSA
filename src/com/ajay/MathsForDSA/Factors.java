package com.ajay.MathsForDSA;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        findFactors(35);
    }
    static void findFactors(int num){
        ArrayList<Integer> arr = new ArrayList<Integer>(1);
        for(int i=1; i<=Math.sqrt(num);i++){
            if(i==num/i){
                System.out.println(i);
            }
            else if (num%i==0){
                System.out.println(i);
                arr.add(num/i);
            }
        }
        for(int i=arr.size()-1; i>=0; i--){
            System.out.println(arr.get(i));
        }
    }
}
