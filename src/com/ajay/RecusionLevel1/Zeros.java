package com.ajay.RecusionLevel1;

public class Zeros {
    public static void main(String[] args) {
        System.out.println(find(504000580, 0));
    }
    static int find(int num, int count){
        if(num == 0){
            return count;
        }
        int rem = num%10;
        if(rem == 0){
            return find(num/10,count+1);
        }else {
            return find(num/10, count);
        }
    }
}
