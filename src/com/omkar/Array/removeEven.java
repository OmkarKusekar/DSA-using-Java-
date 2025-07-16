package com.omkar.Array;

public class removeEven {
    public static void main(String[] args) {
        int[]arr={1,4,7,9,2,6};
        printArray(arr);
        int[]result=RemoveEven(arr);
        printArray(result);

    }

    public static void printArray(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static int[] RemoveEven(int []arr){
        int oddCount=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2!=0){
                oddCount++;
            }
        }
        int []result=new int[oddCount];
        int idx=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }

}

