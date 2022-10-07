package com.rizky.pratikum6;

import java.util.Scanner;

public class Pratikum6_1 {

    public static void main(String[] args) {

        Scanner input;

        int[] inNumber;
        String[] inString;

        System.out.print("Masukkan inputan anda : ");
        input = new Scanner(System.in);

        if (input.hasNextInt()) {
            inNumber = new int[10];
            System.out.println("This input is of type Integer.");
        } else if (input.hasNextLine()) {
            inString = new String[10];
            System.out.println("This input is of type string.");
        } else {
            System.out.println("Inputan tidak sesuai!");
        }

        // stopper for the program
        System.out.println("Press any key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
