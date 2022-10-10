/*
@author: rizkyhaksono
 */

package com.rizky.pratikum6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Pratikum6_1 {

    public void exitProgram() {
        System.out.println("Program berhenti...");
        System.exit(0);
    }

    public static void main (String[] args) throws IOException, InterruptedException {

        Pratikum6_1 p6 = new Pratikum6_1();

        File file = new File("src/com/rizky/pratikum6/database.txt");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        Thread thread = new Thread();

        Scanner input;
        int jumlah;

        int[] inNumber;
        String[] inString;

        System.out.print("Masukkan jumlah data : ");
        input = new Scanner(System.in);
        jumlah = input.nextInt();

        System.out.print("Masukkan inputan anda : ");
        input = new Scanner(System.in);

        if (input.hasNextInt()) {
            System.out.println("[Inputan anda adalah angka]");
            inNumber = new int[jumlah];

            try {
                for (int i = 0; i < inNumber.length; i++) {
                    inNumber[i] = input.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Error : " + e);
                main(args);
            }


            System.out.println("[Integer] Hasil inputan anda : " + Arrays.toString(inNumber));

            bw.write("[Integer]\nHasil inputan anda : " + Arrays.toString(inNumber) + "\n");
            bw.newLine();

            bw.close();
            fw.close();

        } else if (input.hasNextLine()) {
            inString = new String[jumlah];

            for (int i = 0; i < inString.length; i++) {
                inString[i] = input.nextLine();
            }

            System.out.println("[String] Hasil inputan anda : " + Arrays.toString(inString));

            bw.write("[String]\nHasil inputan anda : " + Arrays.toString(inString) + "\n");
            bw.newLine();

            bw.close();
            fw.close();

        } else {
            System.out.println("Inputan tidak sesuai!");
            main(args);
        }

        p6.exitProgram();
    }

}
