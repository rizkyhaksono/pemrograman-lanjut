/**
@author: rizkyhaksono
 */

package com.rizky.praktikum6;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Pratikum6_1 {

    /**
     * Exit code for successful execution
     */
    public void exitProgram() {
        System.out.println("Program berhenti...");
        System.exit(0);
    }

    /**
     * @param input input from user
     * check if input is number or not
     * if input is number, return true
     * if input is not number, return false
     */
    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * @throws IOException if file not found or error while reading file or writing file
     */
    public static void main (String[] args) throws IOException {

        Pratikum6_1 p6 = new Pratikum6_1();

        File file = new File("src/com/rizky/praktikum6/database.txt");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner input;
        int jumlah;

        int[] inNumber;
        String[] inString;

        // read data from file
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("Data Terkini : ");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();

        try {
            System.out.print("Masukkan jumlah data  : ");
            input = new Scanner(System.in);
            jumlah = input.nextInt();
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
            main(args);
            return;
        }

        System.out.print("Check inputan apakah String atau Integer... ");
        input = new Scanner(System.in);

        if (p6.isInteger(input.nextLine())) {
            System.out.println("[Inputan anda adalah Integer]");
            inNumber = new int[jumlah];

            try {
                for (int i = 0; i < inNumber.length; i++) {
                    inNumber[i] = input.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Error : " + e);
                main(args);
            }

            // sorting number
            Arrays.sort(inNumber);
            System.out.println("\n[Integer] Hasil inputan anda : " + Arrays.toString(inNumber));

            bw.write("[Integer]\nHasil inputan anda : " + Arrays.toString(inNumber) + "\n");
            bw.newLine();
        } else {
            System.out.println("[Inputan anda adalah String]");
            inString = new String[jumlah];

            for (int i = 0; i < inString.length; i++) {
                inString[i] = input.nextLine();
            }

            System.out.println("[String] Hasil inputan anda : " + Arrays.toString(inString));

            bw.write("[String]\nHasil inputan anda : " + Arrays.toString(inString) + "\n");
            bw.newLine();
        }

        bw.close();
        fw.close();

        Scanner loop = new Scanner(System.in);

        System.out.print("Masukkan data lagi? (y/n) : ");
        String yesNo = loop.nextLine();

        while(yesNo.equals("y")) {
            main(args);
        }

        p6.exitProgram();
    }

}
