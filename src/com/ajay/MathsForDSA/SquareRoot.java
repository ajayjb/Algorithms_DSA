package com.ajay.MathsForDSA;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.2f",method1(50));
        System.out.println();
        System.out.println(method2(50, 3));
    }
    static double method1(int n){
        double start = 0;
        double end = n;
        double mid = start+(end-start)/2;
        while(end-start>=0.01){
            mid = start+(end-start)/2;
            if(mid*mid == n){
                return mid;
            }else if(mid*mid>n){
                end = mid;
            }else if(mid*mid<n){
                start = mid;
            }
        }
        return mid;
    }
     static double method2(int n, int p){
        int start = 1;
        int end = n;
        int mid = start+(end-start)/2;
        while(start<=end){
            mid = start+(end-start)/2;
            if(mid*mid == n){
                return (double) mid;
            }
            else if(mid*mid > n){
                end = mid - 1;
            }
            else if(mid*mid < n){
                start = mid + 1;
            }
        }
        double ans = end;
        double dec = 0.1;
        for(int i=0; i<p; i++){
            while(ans*ans<=n){
                ans = ans + dec;
            }
            ans = ans - dec;
            dec = dec/10;
        }
        return ans;
     }
}
