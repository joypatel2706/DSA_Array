package com.Learn_DSA;


import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        int[] revArr = new int[n];
        System.out.print("Enter Elements of Array: ");
        // Initialize array
        for (int i=0;i <= n-1;i++){
            arr[i] = scanner.nextInt();
        }

        for (int i=0,j=n-1 ; i <= n-1 ; i++,j-- ){
            revArr[j] =arr[i];
        }
        for (int i:revArr) {
            System.out.print(i);
        }
    }
    public static void main(String[] args){
        reverseArray();
    }
}
