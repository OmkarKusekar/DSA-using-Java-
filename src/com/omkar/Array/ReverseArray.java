package com.omkar.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers={3,4,1,9,0,4,3,5};
        printArray(numbers);
        int[]result=Reverse(numbers,0,numbers.length-1);
        printArray(result);
    }

    public static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] Reverse(int[]numbers,int start,int end) {

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;

        }

        return numbers;
    }
}
