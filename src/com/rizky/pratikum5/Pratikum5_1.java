/*
@author: rizkyhaksono
 */

package com.rizky.pratikum5;

// java library

public class Pratikum5_1 {

    public static void main(String[] args) {

            int[] data = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
            int temp;

            System.out.println("Data sebelum diurutkan : ");
            for (int num : data) {
                System.out.print(num + " | ");
            }

            // sort array
            for (int i = 0; i < data.length; i++) {
                for (int j = i + 1; j < data.length; j++) {
                    if (data[i] > data[j]) {
                        temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
            }

            System.out.println("\n\nData setelah diurutkan : ");
            for (int num : data) {
                System.out.print(num + " | ");
            }

            // search index of array
            System.out.print("\n\nMasukkan index elemen yang mau dicari : ");
            temp = new java.util.Scanner(System.in).nextInt();

            System.out.println("Nilai elemen ke-" + temp + " adalah " + data[temp]);
    }
}
