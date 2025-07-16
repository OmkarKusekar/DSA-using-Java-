package com.omkar;

public class Main {
    public static void main(String []args) {
    int []nums ={12,43,-9,78,90,-33};
    int target=90;

    int ans=linearSearch(nums,target);
    System.out.println (ans);

    }
        static int linearSearch(int[]arr,int target) {
            if (arr.length == 0) {
                return -1;
            }
            for (int index = 0; index < arr.length; index++) {

                int element = arr[index];
                if (element == target) {
                    return index;
                }
            }
            return -1;

        }

}
