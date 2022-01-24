package com.ajay.MathsForDSA;

public class NewtonRapsonMethod {
    public static void main(String[] args) {
        System.out.println(Newton(50));
    }
    static double Newton(int n){
        double x = n;
        double root;
        while(true){
            root = 0.5*(x + n/x);
            if(Math.abs(root-x) < 1){
                break;
            }
            x = root;
        }
        return root;
    }
}
