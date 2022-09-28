package com.rizky.pratikum5;

import java.util.Arrays;
import java.util.Scanner;

public class Pratikum5_3 {

    public static void main(String[] args) {
        int size=0;
        int positif=0;
        int negatif=0;
        int zero=0;


        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        size = scn.nextInt();
//        System.out.println(size);

        int[] inputData = new int[size];
        System.out.print("Masukkan input data : ");
        for (int i = 0; i < size; i++) {
            inputData[i] = scn.nextInt();
        }

//        inputData = new int[size];
        Arrays.sort(inputData);
        System.out.println("Result : ");

        for (int num : inputData) {
            System.out.print(num + " | ");
        }

        for (int i = 0; i < inputData.length; i++) {
            if (inputData[i] < 0) {
                negatif++;
            } else if (inputData[i] > 0) {
                positif++;
            }else if (inputData[i] == 0){
                zero++;
            }
        }
        System.out.println("\nPositif : " + positif);
        System.out.println("Negatif : " + negatif);
        System.out.println("Zero : " + zero);




    }
}
