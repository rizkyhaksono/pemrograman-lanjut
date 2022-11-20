/*
@author: rizkyhaksono
 */

package com.rizky.pratikum5;

import java.util.Scanner;

public class Pratikum5_3 {

    // check if the input is a number
    public boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // loop until the input is a number
    public int inputNumber(String str) {
        Scanner scn = new Scanner(System.in);
        String input;
        int number = 0;
        boolean isNumber = false;

        while (!isNumber) {
            System.out.print(str);
            input = scn.nextLine();
            isNumber = isNumber(input);
            if (isNumber) {
                number = Integer.parseInt(input);
            } else {
                System.out.println("Input harus Integer!");
            }
        }

        return number;
    }

    public static void main(String[] args) {
         Pratikum5_3 p3 = new Pratikum5_3();

         int[] arr = new int[p3.inputNumber("Size : ")];

         for (int i = 0; i < arr.length; i++) {
             arr[i] = p3.inputNumber("Input data ke-" + (i + 1) + " : ");
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
         for (int k : arr) {
             System.out.print(k + " ");
         }

         // positive, negative and zero number
        int positive = 0, negative = 0, zero = 0;
         for (int j : arr) {
             if (j > 0) {
                 positive++;
             } else if (j < 0) {
                 negative++;
             } else {
                 zero++;
             }
         }

         // int to float
         float positiveResult = (float) positive / arr.length;
         float negativeResult = (float) negative / arr.length;
         float zeroResult = (float) zero / arr.length;

         System.out.printf("\n\nPositive : %.2f\n", positiveResult);
         System.out.printf("Negative : %.2f\n", negativeResult);
         System.out.printf("Zero : %.2f", zeroResult);
    }
}
