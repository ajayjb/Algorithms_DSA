package com.ajay.Patterens;

public class Pattern4 {
    public static void main(String[] args) {
         patteren(7);
        patteren(7);
    }
    static void patteren(int n){
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){
                System.out.print("* ");
            }
                System.out.println();
        }
        for(int i =1; i<=n-2; i++){
            for(int s=1; s<=2; s++){
                System.out.print(" ");
            }
            for (int j=1; j<=n-2; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
