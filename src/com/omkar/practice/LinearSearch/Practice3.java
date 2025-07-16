package com.omkar.practice.LinearSearch;

public class Practice3 {
    public static void main(String[] args) {
        int []arr={1,2,5,3,6,8,9,34,53};
        boolean ans=LinearSearch(arr,53);
        System.out.println(ans);
    }
    static boolean LinearSearch(int []arr,int target){
        for(int element:arr){
            if (element==target){
                return true;
            }
        }
        return false;
    }
}
