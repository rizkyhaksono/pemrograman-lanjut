/*
@author: rizkyhaksono
 */

package com.rizky.pratikum6;

import java.util.Scanner;

public class Pratikum6_1 {
    public static void main(String[] args) {
        int[] inNumber;
        int[] inString;

        int n, i;

        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan inputan anda : ");
        int temp = scn.nextInt();

        try {
            if (temp != 0) {
                System.out.println(temp);
            } else if (temp) {
                System.out.println("Tidak ada isi nya");
            } else {
                System.out.println("Tidak ada inputan yang benar");
            }

            for(int index = 0; temp[i].nimCek[index] != '\0'; index++) { // \0 =  diatur agar semua bit menjadi tidak nol
                // tanda !"#$%&'()*+`-'/
                if(temp[i].nim[index] >= 0x30 && temp[i].nimCek[index] <= 0x39){
                    System.out.println("Tidak boleh ada angka diantaranya");

                    break;
                    // tanda :;<=>?@
                }else if(temp[i].nimCek[index] >= 0x3A && temp[i].nimCek[index] <= 0x40){
                    System.out.println("Tidak boleh ada String diantaranya");

                    break;
                }
            }


        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

}
