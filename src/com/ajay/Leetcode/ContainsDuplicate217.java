package com.ajay.Leetcode;
import java.util.HashMap;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(checker(new int[] {1,2,3,1}));
    }
    static boolean checker(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
