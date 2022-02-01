package com.ajay;

import java.util.ArrayList;

public class Frog {
    public static void main(String[] args) {
        System.out.println(distanace(new int[] {2,6,5,8}));
    }
    static int distanace(int[] arr){
        ArrayList<Integer> counts = new ArrayList<Integer>(1);
        for(int i=0; i<=arr.length-1;i++){
            int AFrog = i;
            int BFrog = i;
            for(int j=i; j>0; j--){
                if(arr[j-1]>=arr[j]){
                    AFrog-=1;
                }else {
                    break;
                }
            }
            for(int k=i; k<arr.length-1; k++){
                if(arr[k+1]>=arr[k]){
                    BFrog+=1;
                }else{
                    break;
                }
            }
            counts.add(BFrog-AFrog+1);
        }
        System.out.println(counts);
        int max = counts.get(0);
        for(int num: counts){
            if (num>max){
                max = num;
            }
        }
        return max;
    }
}
