package com.omkar.LinearSearch;

public class LinearSearch1 {
    public static void main(String [] args){
        int [] nums={5,-2,7,4,0,7,-1};

        int target=-1;

        boolean ans=LinearSearch(nums,target);
        System.out.println(ans);
    }
    static boolean LinearSearch(int[] nums,int target){
        for (int element : nums){
            if(element==target){
                return true;
            }

        }
        return false;
    }
}

