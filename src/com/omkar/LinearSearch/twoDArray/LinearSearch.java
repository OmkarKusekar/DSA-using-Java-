package com.omkar.LinearSearch.twoDArray;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[][]arr={
                {1,3,78,23},
                {32,45,89,0,11},
                {13,54,65,9,63,21},
                {10,3}
        };

        int target=11;
        int []ans=linearSearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int []linearSearch(int[][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
