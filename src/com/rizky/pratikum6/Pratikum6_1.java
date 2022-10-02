/*
    @author: rizkyhaksono
*/

/*
    Java library for input and output (I/O) operations
*/
package com.rizky.pratikum6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Pratikum6_1 {

    /*
        This is a method to write a file
     */
    public void method() throws IOException {
        int[] inNumber = new int[100];
        String[] inString = new String[100];

        Scanner scn = new Scanner(System.in);
        Scanner scnInt = new Scanner(System.in);
        Scanner scnStr = new Scanner(System.in);

        File file = new File("src/com/rizky/pratikum6/database.txt");
        FileWriter fw = new FileWriter(file);

        System.out.println("1. String\n2. Int\n3. Exit");
        System.out.print("Masukkan inputan anda : ");

        int input = scn.nextInt();

        switch (input) {
            case 1 -> {
                /*
                    This is for String input and output through file
                */
                String str = null;
                try {
                    System.out.print("Masukkan berapa elemen yang anda mau : ");
                    str = scnStr.nextLine();

                    System.out.println("Masukkan data elemen : ");

                    for (int i = 0; i < Integer.parseInt(str); i++) {
                        inString[i] = scnStr.nextLine();
                    }

                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }
                System.out.print("Element anda adalah : ");
                System.out.print("{ ");
                for (int i = 0; i < Integer.parseInt(Objects.requireNonNull(str)); i++) {
                    System.out.print(inString[i] + ", ");
                    fw.append(inString[i]).append(", ");
                }
                System.out.print("}");
                ulang();
                fw.flush();
                fw.close();
            }
            case 2 -> {
                /*
                    This is for Integer input and output through file
                 */
                int integer = 0;
                try {
                    System.out.print("Masukkan berapa elemen yang anda mau : ");
                    integer = scnInt.nextInt();

                    System.out.println("Masukkan data elemen : ");
                    for (int i = 0; i < integer; i++) {
                        inNumber[i] = scn.nextInt();
                    }

                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }
                System.out.print("Element anda adalah : ");
                System.out.print("{ ");
                for (int i = 0; i < integer; i++) {
                    System.out.print(inNumber[i] + ", ");
                    fw.append(String.valueOf(inNumber[i])).append(", ");
                }
                System.out.print("}");
                ulang();
                fw.flush();
                fw.close();
            }
            case 3 -> {
                System.out.println("Terima kasih telah menggunakan program ini");
                System.exit(0);
            }
            default -> {
                /*
                    This is for default output for wrong input
                 */
                System.out.println("\nTidak ada inputan selain 1 dan 2!");
                method();
            }
        }
    }

    /*
        This is for looping the program and ask user to continue or not
     */
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

    /*
        This is for main method
     */
    public static void main(String[] args) throws IOException {
        Pratikum6_1 p6 = new Pratikum6_1();

        p6.method();
    }
}
