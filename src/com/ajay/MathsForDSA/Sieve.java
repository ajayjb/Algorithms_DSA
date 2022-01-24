package com.ajay.MathsForDSA;

public class Sieve {
    public static void main(String[] args) {
        sieve(36);
    }
    static void sieve(int n){
        boolean[] arr = new boolean[n+1];
        for(int i=2; i<=Math.sqrt(n); i++){
            if(!arr[i]){
                for (int j=i*2; j<=n; j=j+i){
                    arr[j] = true;
                }
            }
        }
        for (int i=2; i<=n; i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }
}
