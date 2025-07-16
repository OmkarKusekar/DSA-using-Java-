package com.omkar.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int target=3;
        //LinearSearch linearSearch=new LinearSearch();
        //int ans=linearSearch.Search(arr,5);
        //System.out.println(ans);

        System.out.println(Search(arr,target));


    }
    public static int Search(int[]arr,int target){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
