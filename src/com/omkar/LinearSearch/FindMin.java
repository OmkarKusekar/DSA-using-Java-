package com.omkar.LinearSearch;

public class FindMin {
    public static void main(String [] args){

        int [] arr={3,-4,6,6,1,9,5};

        System.out.println(min(arr));

    }
    static int min(int []arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];

            }
        }
        return ans;
    }
}
