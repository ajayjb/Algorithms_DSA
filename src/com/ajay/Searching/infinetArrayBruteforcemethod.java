package com.ajay;

public class infinetArrayBruteforcemethod {
    public static void main(String[] args) {
        int[] nums = {5,7,9,10,11,54,100};
        System.out.println(Search(nums, 1000));
    }
    static int Search(int[] arr, int target) {
        int i = 0;
        try {
            while (target != arr[i]) {
                i++;
            }
        }catch(Exception e){
              return  -1;
            }
            return i;
        }
}
