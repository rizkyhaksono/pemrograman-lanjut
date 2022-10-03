/*
@author: rizkyhaksono
 */

package com.rizky.pratikum2;

import java.util.Scanner;

public class Pratikum2_2 {

    public String[] book = new String[1];
    public String[] place = new String[1];
    public int[] date = new int[1];

    void cekDate(int date) {
        if (date < 2018 || date > 2022) {
            System.out.println("Tahun tidak valid");
            System.out.println("Masukkan date antara tahun 2018 - 2022");
        } else {
            System.out.println("Tahun valid");
        }
    }

    void cekFrom(String from) {
        for (int i = 0; from.equals(place[i]); i++) {
            if (from.compareTo(place[i]) == 0) {
                return;
            }
        }
    }

    void cekName(String name) {
        for (int i = 0; name.equals(book[i]); i++) {
            if (name.compareTo(book[i]) == 0) {
                return;
            }
        }
    }

    void list() {
        for (int i = 0; i < book.length && i < place.length && i < date.length; i++) {
            System.out.println("[" + i + "] " + book[i] + ", " + place[i] + ". " + date[i]);
        }
    }

    public static void main(String[] args) {

        Pratikum2_2 pTwo = new Pratikum2_2();

        String inName, inFrom;
        int inDate;

        int num;

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Welcome to Library");

            System.out.print("Nama : ");
            inName = input.nextLine();
            pTwo.cekName(inName);

            System.out.print("From : ");
            inFrom = input.nextLine();
            pTwo.cekFrom(inFrom);

            System.out.print("Date : ");
            inDate = input.nextInt();
            pTwo.cekDate(inDate);

            do {
                if (inDate < 2018 || inDate > 2022) {
                    System.out.print("Date : ");
                    inDate = input.nextInt();
                    pTwo.cekDate(inDate);
                    num = -1;
                } else {
                    num = 1;
                }
            } while (num == -1);

            String bookName = inName;
            String placeName = inFrom;
            int dateName = inDate;

            for (int i = 0; i < pTwo.book.length && i < pTwo.place.length && i < pTwo.date.length; i++) {
                pTwo.book[i] = bookName;
                pTwo.place[i] = placeName;
                pTwo.date[i] = dateName;
            }

            System.out.println("Buku berhasil ditambahan");
            pTwo.list();

            // ask to add more
            System.out.print("\nTambah buku lagi? [y/n] ");
            String ask = input.next();
            if (ask.equals("y")) {
                main(args);
            } else {
                System.exit(0);
                System.out.println("Terima kasih");
            }

        } catch (Exception e) {
            System.out.println("Buku gagal ditambahan");
            System.out.println("Error : " + e);
            main(args);
        }

    }
}
