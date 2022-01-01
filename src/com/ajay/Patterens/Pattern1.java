package com.ajay.Patterens;

public class Pattern1 {
    public static void main(String[] args) {
          patteren6(4);
    }

    static void patteren1(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patteren2(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patteren3(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patteren4(int n){
        for(int i=1; i<=n; i++){
            for (int j=4; j>i-1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patteren5(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patteren6(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
