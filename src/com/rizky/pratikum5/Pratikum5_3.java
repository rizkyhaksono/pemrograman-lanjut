package com.rizky.pratikum5;

import java.util.Scanner;

public class Pratikum5_3 {

    public static void main(String[] args) {

        int size;

        Scanner scn = new Scanner(System.in);

        System.out.print("Size : ");
        size = scn.nextInt();

        int[] arr = new int[size];

        System.out.print("Input data : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nResult : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // positive, negative and zero number
        int positive = 0, negative = 0, zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("\n\nPositive : " + positive);
        System.out.println("Negative : " + negative);
        System.out.println("Zero : " + zero);
    }
}
