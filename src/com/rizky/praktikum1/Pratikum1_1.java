/**
 @author: rizkyhaksono
 */

package com.rizky.praktikum1;

public class Pratikum1_1 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        try {
            // 0 1 2 3 4
            arr[5] = 25;
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // index 5 out of bounds for length 5

//        try {
//            int[] arr = new int[6];
//            arr[5] = 25;
//            System.out.println(arr[5]);
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }

    }
}
