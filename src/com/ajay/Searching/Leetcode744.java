package com.ajay;

public class Leetcode744 {
    public static void main(String[] args) {
       char[] arr = {'c','f','j'};
       System.out.print(next(arr, 'j'));
    }
    static char next(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        int mid;
        while(end>=start){
            mid = start+((end-start)/2);
            if (target<letters[mid]){
                end = mid-1;
            }
            else if(target>letters[mid]){
                start=mid+1;
            }
            else if(target==letters[mid]){
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
