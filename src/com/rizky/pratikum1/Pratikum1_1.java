package com.rizky.pratikum1;

public class Pratikum1_1 {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[5] = 25;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // index 5 out of bounds for length 5

    }
}
