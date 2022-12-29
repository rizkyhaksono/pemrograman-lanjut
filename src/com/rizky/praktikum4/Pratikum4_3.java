/**
 @author: rizkyhaksono
 */

package com.rizky.praktikum4;

import java.util.Scanner;

public class Pratikum4_3 {

    private static int hari;

    Scanner scn = new Scanner(System.in);

    public static int getHari() {
        return hari;
    }

    public void setHari() {
        System.out.print("Masukkan jumlah hari : ");
        Pratikum4_3.hari = scn.nextInt();
    }


    public static void main(String[] args) {

        Pratikum4_3 p4 = new Pratikum4_3();

        do {
            p4.setHari();

            getHasils();
            System.out.print("Apakah anda ingin mengulang? (y/n) : ");
            p4.scn.nextLine();
        } while (p4.scn.nextLine().equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan program ini");
    }

    private static void getHasils() {
        System.out.println("Jumlah hari " + getHari());
        System.out.println(getHari() + " hari = " + getHari() / 365
                + " tahun" + " " + getHari() % 365 / 30
                + " bulan" + " " + getHari() % 365 % 30 + " hari");
    }

}
