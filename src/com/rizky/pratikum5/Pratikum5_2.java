/*
@author: rizkyhaksono
 */

package com.rizky.pratikum5;

// java API

import java.util.Arrays;
import java.util.Scanner;

public class Pratikum5_2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] data = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        int temp;

        System.out.println("Data sebelum diurutkan : ");
        for (int num : data) {
            System.out.print(num + " | ");
        }

        // sort array
        Arrays.sort(data);

        System.out.println("\n\nData setelah diurutkan : ");
        for (int num : data) {
            System.out.print(num + " | ");
        }

        // search index of array
        System.out.print("\n\nMasukkan index elemen yang mau dicari : ");
        temp = scn.nextInt();

        System.out.println("Nilai elemen ke-" + temp + " adalah " + data[temp]);
    }
}
