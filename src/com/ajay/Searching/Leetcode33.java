package com.ajay;

public class Leetcode33 {
    public static void main(String[] args) {
       int[] nums = {3,4,5,6,7,0,1,2};
        System.out.println(Search(nums, 1));

        int[] arr = {2,9,2,2,2,2};
        System.out.println(PivotwithDuplicate(arr));

        System.out.println(Pivot(new int[]{2,1}));
    }
// To find pivot
    static int Pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(end>=start){
            int mid = start + (end-start)/2;
            // Here we are using (mid<end) make when mid at last index pos it should not evaluate this because if it will
            // give error array is out of bound.
            if((mid<end) && arr[mid] > arr[mid+1]){
                return mid;
            }
            // Here we are using (mid>start) make when mid at first index pos it should not evaluate this because if it will
            // give error array is out of bound.
            else if((mid>start) && arr[mid] < arr[mid-1]){
                return  mid-1;
            }
            // Here we are using = because if pivot not found loop infinite. this helps to break when start and end coincide.
            else if(arr[start]>=arr[mid]){
                end = mid - 1;
            }
            else if (arr[start]<arr[mid]){
                start = mid +1;
            }
        }
        return -1;
    }

    // To find pivotwithDuplicate
    static int PivotwithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(end>=start){
            int mid = start + (end-start)/2;
            // Here we are using (mid<end) make when mid at last index pos it should not evaluate this because if it will
            // give error array is out of bound.
            if((mid<end) && arr[mid] > arr[mid+1]){
                return mid;
            }
            // Here we are using (mid>start) make when mid at first index pos it should not evaluate this because if it will
            // give error array is out of bound.
            else if((mid>start) && arr[mid] < arr[mid-1]){
                return  mid-1;
            }
            // if Start, mid, end are same then check whether they are pivots, if they are not ignore them.
            else if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                if (arr[start]>arr[start+1]){
                    return  start;
                }
                start++;
                if(arr[end-1]>arr[end]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || arr[start] == arr [mid] && arr[mid]>arr[end]){
                     start = mid+1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int Search(int[] arr,  int target){
        int findPivot = Pivot(arr);
        if (findPivot == -1){
            return Binary(arr,target,0, arr.length-1);
        }
        else if (findPivot != -1){
            if (arr[findPivot] == target){
                return findPivot;
            }
//            int left = Binary(arr,target, 0, findPivot-1);
//            if (left != -1){
//                return left;
//            }
//            else{
//                return Binary(arr, target, findPivot+1, arr.length-1);
//            }
            if (target >= arr[0]){
                return Binary(arr,target, 0, findPivot-1);
            }
//            else{
//                return Binary(arr, target, findPivot+1, arr.length-1);
//            }
        }
        return Binary(arr, target, findPivot+1, arr.length-1);
    }

    // To find target
    static int Binary(int[] arr, int target, int start, int end){
        while(end>=start){
            int mid = start + (end-start)/2;
            if (target > arr[mid]){
                start = mid+1;
            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else if (target == arr[mid]){
                return  mid;
            }
        }
        return -1;
    }

}

