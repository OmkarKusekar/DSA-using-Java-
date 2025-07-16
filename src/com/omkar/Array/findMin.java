package com.omkar.Array;

public class findMin {
    public static void  main(String[]args){
       int[]arr={23,78,87,45,21,2,11};

       findMin min=new findMin();
       int ans= min.findMinimum(arr);
        System.out.println(ans);
    }
    public int findMinimum(int[]arr){
            if(arr==null || arr.length==0){
                throw new IllegalArgumentException("Invalid Input");
            }
            int min=arr[0];  // min hold the minimum of array
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }


}
