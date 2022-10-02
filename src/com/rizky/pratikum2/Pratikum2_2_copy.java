/*
@author: rizkyhaksono
 */

package com.rizky.pratikum2;

import java.util.Scanner;

public class Pratikum2_2_copy {

    public String[] book = new String[3];
    String[] place = {"Malang", "Bandung", "Surabaya"};

    void cekDate(int date) {
        if (date < 2018 || date > 2022) {

        }
    }

    void cekFrom(String from) {
        for (int i = 0; place[i][0] != '\0'; i++) {
            if (from.compareTo(place[i]) == 0) {
                System.out.println(i);
            }
        }
    }

    void cekName(String name) {
        for (int i = 0; book[i][0] != '\0'; i++) {
            if (name.compareTo(book[i]) == 0) {
                System.out.println(i);
            }
        }
    }

    void list() {
        for (int i = 0; book[i][0] != '\0'; i++) {
            System.out.println(book[i]);
        }
    }

    public static void main(String[] args) {

        Pratikum2_2_copy pTwo = new Pratikum2_2_copy();

        String inName, inFrom;
        int inDate;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Library");

        System.out.println("Nama : ");
        inName = input.nextLine();
        pTwo.cekName(inName);

        System.out.println("From : ");
        inFrom = input.nextLine();
        pTwo.cekFrom(inFrom);

        System.out.println("Date : ");
        inDate = input.nextInt();
        pTwo.cekDate(inDate);

        String bookName = (inName + "" + inFrom + "" + inDate);
        pTwo.book[1] = bookName;

        System.out.println("Buku berhasil ditambahan");
        pTwo.list();

    }


}
