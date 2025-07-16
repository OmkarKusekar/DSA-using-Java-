package com.omkar.Array;

public class removeOdd {
    public static void main(String[] args) {
        int[]arr={2,4,7,1,9,3,8};

        printArray(arr);
        int[] result=RemoveOdd(arr);

        printArray(result);
    }

    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] RemoveOdd(int[]arr){
        int EvenCount=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                EvenCount++;
            }
        }
        int[]result=new int[EvenCount];
        int idx=0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2==0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }
}
