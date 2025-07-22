package com.omkar.LinearSearch.Array;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int [][]arr={
                {12,21,34,43,56,65},
                {11,33,24},
                {67,37,19,20}
        };
        int target=24;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }
    public static int[] search(int [][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int max(int[][]arr){
        int max=Integer.MIN_VALUE;
       for(int[]ints:arr){
           for(int element:ints){
               if(element>max){
                   max=element;
               }
           }
       }
       return max;
    }
}
