package com.omkar.LinearSearch;

import java.util.Scanner;

public class LinearSearch3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the array elements ");
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter the element at index "+i+" ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the target element:");
        int target=scanner.nextInt();

        int ans=linearSearch(arr,target);
        System.out.println(ans);
    }

    static int linearSearch(int[]arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
