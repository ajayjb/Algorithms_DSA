package com.ajay.PepCoding;

public class BenjaminBulbs {
    public static void main(String[] args) {
         benjamin(100);
         benj(100);
    }
    static void benjamin(int n){
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j%i == 0){
                    if(arr[j] == 1){
                        arr[j] = 0;
                    }else{
                        arr[j] = 1;
                    }
                }
            }
        }
        for(int i=1; i<=n;i++){
            if(arr[i] == 1){
                System.out.print("b"+ i + " ");
            }
        }
    }

    static void benj(int n){
        for(int i=1; i<=n; i++){
            if(i*i>n){
                break;
            }
            System.out.println(i*i);
        }
    }
}
