/**
@author: rizkyhaksono
 */

package com.rizky.praktikum6;

import java.io.*;
import java.util.*;

public class Pratikum6_1 {

    /**
     Exit program using system.out()
     */
    public void exitProgram() {
        System.out.println("Program berhenti...");
        System.exit(0);
    }

    // check if input is integer
    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     main method for driver class
     */
    public static void main (String[] args) throws IOException, InterruptedException {

        Pratikum6_1 p6 = new Pratikum6_1();

        File file = new File("src/com/rizky/praktikum6/database.txt");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner input;
        int jumlah;

        int[] inNumber;
        String[] inString;

        try {
            System.out.print("Masukkan jumlah data  : ");
            input = new Scanner(System.in);
            jumlah = input.nextInt();
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
            main(args);
            return;
        }

        System.out.print(" ");
        input = new Scanner(System.in);

        if(p6.isInteger(input.nextLine())) {
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
        } else {
            System.out.println("[Inputan anda adalah String]");
            inString = new String[jumlah];

            for (int i = 0; i < inString.length; i++) {
                inString[i] = input.nextLine();
            }

            System.out.println("[String] Hasil inputan anda : " + Arrays.toString(inString));

            bw.write("[String]\nHasil inputan anda : " + Arrays.toString(inString) + "\n");
            bw.newLine();

            bw.close();
            fw.close();
        }

        Scanner ulang = new Scanner(System.in);

        System.out.print("Masukkan data lagi? (y/n) : ");
        String yesNo = ulang.nextLine();

        while(yesNo.equals("y")) {
            main(args);
        }

        p6.exitProgram();
    }

}
