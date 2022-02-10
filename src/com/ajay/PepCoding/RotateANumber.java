package com.ajay.PepCoding;

public class RotateANumber {
    public static void main(String[] args) {
        System.out.println(method1(34589, 1));
        System.out.println(method2(34589, 1));
        System.out.println(method3(34589, 1));
    }
    //By converting Int to String
    static int method1(int num, int k){
        String snum = String.valueOf(num);
        String first = "";
        String last = "";
        if(k>0){
            for(int i=snum.length()-k; i<snum.length();i++){
                first = first + snum.charAt(i);
            }
            for(int j=0; j<snum.length()-k;j++){
                last = last + snum.charAt(j);
            }
            return Integer.parseInt(first+last);
        }
        for (int i=0; i<Math.abs(k);i++){
            last = last + snum.charAt(i);
        }
        for (int j=Math.abs(k); j<snum.length();j++){
            first = first + snum.charAt(j);
        }
        return Integer.parseInt(first+last);
    }
    // By keeping Int as Int
    static int method2(int num, int k){
        int len = 0;
        int temp = num;
        while(temp>0){
            temp = temp/10;
            len++;
        }
        if(k<0){
            k = len + k;
        }
        k = k%len;
        int mul = 1;
        int div = 1;
        for(int i=1; i<=len; i++){
            if(i<=k){
                div = div * 10;
            }else {
                mul = mul * 10;
            }
        }
        int first = (num%div)*mul;
        int last = num/div;
        return first+last;
    }

    static int method3(int num, int k){
        int len = (int) Math.log10(num)+1;
        if(k<0){
            k = len + k;
        }
        k = k%len;
        int mul = (int) Math.pow(10, len-k);
        int div = (int) (Math.pow(10, k));
        int first = (num%div)*mul;
        int last = num/div;
        return first+last;
    }
}
