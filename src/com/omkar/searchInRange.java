package com.omkar;

public class searchInRange {
    public static void main(String []args){
    int [] nums={12,32,43,122,3,89,56,34};
    int target=300;
    System.out.println(linearSearch(nums,target,1,6));
    }
    static int linearSearch(int [] arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int index = start; index<=end ; index++) {
            int element=arr[index];
            if (element==target){
                return index;
            }
        }
        return -1;
    }
}
