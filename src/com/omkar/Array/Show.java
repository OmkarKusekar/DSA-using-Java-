package com.omkar.Array;

public class Show {

    public void printArray(int[]arr){
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Show show=new Show();
        show.printArray(new int[]{3,2,7,3,9});

    }
}
