package com.omkar.practice.LinearSearch;

public class Practice1 {
    public static void main(String[] args) {
        int[]arr={12,21,34,43,56,65,78,87,35,46,73};

    }
    static int LinearSearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index <arr.length ; index++) {
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
