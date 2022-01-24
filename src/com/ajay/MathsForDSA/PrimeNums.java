package com.ajay.MathsForDSA;

public class PrimeNums {
    public static void main(String[] args) {
//        for (int j=0; j<=30; j++){
//            System.out.println(j + " is " + isPrime(j));
//        }
        Prime(9);
    }
    static boolean isPrime(int num){
        if(num<1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    static void Prime(int num){
        for(int i=2; i<=num; i++){
            boolean isprime = true;
            int c =2;
            while(c*c<=i){
                if(i%c==0){
                    isprime = false;
                    break;
                }
                c++;
            }
            if(isprime == true){
                System.out.println(i);
            }
        }
    }
}
