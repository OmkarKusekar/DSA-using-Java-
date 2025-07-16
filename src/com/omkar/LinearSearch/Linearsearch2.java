package com.omkar.LinearSearch;

import java.util.Scanner;

public class Linearsearch2 {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=scanner.nextInt();

        int[] arr=new int [size];
        System.out.print("Enter the array elements: ");
        for (int index = 0; index< size; index++) {
            System.out.println("Enter the element at index "+index+" ");
            arr[index]=scanner.nextInt();
            
        }
        System.out.println("Enter the target element to find :");
        int target=scanner.nextInt();

        int ans=linearsearch(arr,target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr,int target){
        for (int index = 0; index <arr.length ; index++) {
            if (arr[index]==target){
                return index;
            }

        }
        return -1;

        }
}

