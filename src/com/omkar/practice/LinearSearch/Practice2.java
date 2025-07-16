package com.omkar.practice.LinearSearch;

public class Practice2 {
    public static void main(String[] args) {
        int[]arr={1,5,7,2,0,4,3};
        int ans=LinearSearch(arr,0);
        System.out.println(ans);
    }
    static int LinearSearch(int[]arr,int target){
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
