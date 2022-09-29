/*
@author: rizkyhaksono
 */

package com.rizky.pratikum6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pratikum6_1 {

    public void method() throws IOException {
        int[] inNumber = new int[100];
        int[] inString = new int[100];

        Scanner scn = new Scanner(System.in);

        File file = new File("src/com/rizky/pratikum6/database.txt");
        FileWriter fw = new FileWriter(file);

        System.out.println("1. String\n2. Int");
        System.out.print("Masukkan inputan anda : ");
        int input = scn.nextInt();

        switch (input) {
            case 1:
                String str;

                System.out.print("Masukkan berapa jumlah String : ");

                ulang();

                break;
            case 2:
                int n = 0;

                try {

                    System.out.print("Masukkan berapa elemen yang anda mau : ");
                    n = scn.nextInt();

                    System.out.println("Masukkan data elemen : ");
                    for (int i = 0; i < n; i++) {
                        inNumber[i] = scn.nextInt();
                    }

                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }

                System.out.print("Element anda adalah : ");
                System.out.print("{ ");
                for (int i = 0; i < n; i++) {
                    System.out.print(inNumber[i] + ", ");
                    fw.append(String.valueOf(inNumber[i])).append(", ");

                }

                System.out.print("}");

                ulang();

                fw.flush();
                fw.close();
                break;

            default:
                System.out.println("\nTidak ada inputan selain 1 dan 2!");
                method();
                break;
        }
    }

    public void ulang() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nApakah anda ingin mengulang ? [y/n] : ");

        String inputan = scanner.nextLine();

        if (inputan.equals("y")) {
            method();
        } else if (inputan.equals("n")) {
            System.out.println("Terima kasih telah menggunakan program ini!");
        } else {
            System.out.println("Inputan anda salah");
            ulang();
        }

    }

    public static void main(String[] args) throws IOException {

        Pratikum6_1 p6 = new Pratikum6_1();

        p6.method();

    }
}
