/**
 @author: rizkyhaksono
 */

package com.rizky.praktikum5;

// java API
import java.util.Arrays;

public class Pratikum5_2 {

    public static void main(String[] args) {

        int[] data = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};

        // before sorting
        System.out.println("Data sebelum diurutkan : \n" + Arrays.toString(data));

        // sort array
        Arrays.sort(data);

        // after sorting
        System.out.println("\nData setelah diurutkan : ");
        System.out.print("[");
        for (int num : data) {
            System.out.print(num + ", ");
        }
        System.out.println("]");

        // search index of array with binary search
        System.out.print("\nMasukkan index elemen yang mau dicari : ");
        int index = Arrays.binarySearch(data, new java.util.Scanner(System.in).nextInt());
        System.out.println("Nilai elemen ke-" + index + " adalah " + data[index]);
    }
}
