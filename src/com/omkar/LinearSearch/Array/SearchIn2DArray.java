package com.omkar.LinearSearch.Array;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][]arr={
                { 23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
            int target=34;
            int [] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int []search(int[][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int colm = 0; colm < arr[row].length; colm++) {
                if(arr[row][colm]==target){
                    return new int[]{row,colm};
                }
                
            }

        }
        return new int[]{-1,-1};
    }
}
