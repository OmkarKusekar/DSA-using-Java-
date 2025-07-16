package com.omkar.LinearSearch.Array;

import java.util.Scanner;

public class Array2d {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int rows =scanner.nextInt();
        int colms=scanner.nextInt();

        int[][] numbers=new int[rows][colms];
        
        // input
        //rows
        for (int i = 0; i < rows; i++) {
            //colms
            for (int j = 0; j < colms; j++) {
                numbers[i][j]=scanner.nextInt();

            }
            
        }
//        for (int i = 0; i <rows ; i++) {
//            for (int j = 0; j <colms ; j++) {
//                System.out.println(numbers[i][j]);
//            }
//        }

        int target= scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <colms ; j++) {
                if(numbers[i][j]==target){
                    System.out.println("Target found at position ("+i+","+j+")");
                }

            }
        }
    }
}
