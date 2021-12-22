package com.ajay;

public class Leetcode1095 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,3,2,0};
        System.out.println(find(nums, 0));
    }
    // TO find Peak element in Bitonic or Mountain Array
    static int Peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(end>start){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    // OrderAgnostic BinarySearch
    static int Binary(int[] arr, int  target, int start, int end){
          if (arr[start]<arr[end]){
              while(end>=start){
                  int mid = start + (end-start)/2;
                  if (target > arr[mid]){
                      start = mid + 1;
                  }
                  else if(target < arr[mid]){
                      end = mid - 1;
                  }
                  else if(target == arr[mid]){
                      return mid;
                  }
              }
          }
          else if (arr[start]>arr[end]){
              while(end>=start){
                  int mid = start + (end-start)/2;
                  if (target > arr[mid]){
                      end = mid - 1;
                  }
                  else if(target < arr[mid]){
                      start  = mid + 1;
                  }
                  else if(target == arr[mid]){
                      return mid;
                  }
              }
          }
          return -1;
    }
 // To find target element
    static int find(int[] arr, int target){
      int peakValue = Peak(arr);
      int leftMountain = Binary(arr, target, 0, peakValue);
      int rightMountain = Binary(arr, target, peakValue, arr.length-1);
      if (leftMountain == -1 && rightMountain == -1){
          return -1;
      }
      else if(leftMountain != -1){
          return leftMountain;
      }
      return rightMountain;
    }
}


