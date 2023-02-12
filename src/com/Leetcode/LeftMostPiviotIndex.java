package com.Leetcode;


import javax.management.relation.RoleUnresolvedList;

class Solution {
    public int pivotIndex(int[] nums) {
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(leftsum(nums,i)==rightsum(nums,i)){
                ans = i;
                break;
            }else{
                ans = -1;
            }
        }

        return ans;


    }
    int leftsum(int[] arr,int p){
        int count = 0;
        if(p == 0){
            return 0;
        }else{
            for(int i = 0;i<p;i++){
                count +=arr[i];
            }
        }
        return count;
    }

    int rightsum(int[] arr,int p){
        int count = 0;
        if(p == arr.length){
            return 0;
        }else{
            for(int i = p+1;i<arr.length;i++){
                count +=arr[i];
            }
        }
        return count;
    }
}
public class LeftMostPiviotIndex {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int arr[] = {1,7,3,6,5,6};
        System.out.println(s1.pivotIndex(arr));
        System.out.println(s1.leftsum(arr,3));
    }
}
