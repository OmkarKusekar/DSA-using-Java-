package com.omkar.LinearSearch;

public class Linearsearch {
    public static void main(String [] args){
        int []nums={1,2,3,4,5,6,7};

        int target=4;

        int ans=LinearSearch(nums,target);
        System.out.println(ans);
    }
    static int LinearSearch(int [] nums,int target){
        if(nums.length==0){
            return -1;
        }
        for(int index=0;index<nums.length;index++){
            int element=nums[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
