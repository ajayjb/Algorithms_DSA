package com.ajay.PepCoding;

import java.util.ArrayList;

public class PrimeFactorization {
    public static void main(String[] args) {
        System.out.println(find(1440));
    }
    static ArrayList find(int n){
        ArrayList<Integer> collection = new ArrayList<>(0);
        for(int i=2; i<=n; i++){
            while(n%i == 0){
               n = n/i;
               collection.add(i);
            }
            if(n==1){
                collection.add(1);
            }
        }
        return  collection;
    }
}
