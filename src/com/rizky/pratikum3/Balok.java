package com.rizky.pratikum3;

import java.util.Scanner;

public class Balok {

    private int panjang, lebar, tinggi;

    Scanner scn = new Scanner(System.in);

    public void setPanjang() {
        System.out.print("Masukkan panjang : ");
        this.panjang = scn.nextInt();
    }

    public void setLebar() {
        System.out.print("Masukkan lebar : ");
        this.lebar = scn.nextInt();
    }

    public void setTinggi() {
        System.out.print("Masukkan tinggi : ");
        this.tinggi = scn.nextInt();
    }

    public int getPanjang() {
        return this.panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    protected void hasil() {
        Perhitungan ph = new Perhitungan();
        System.out.println("\nHasil luas balok : " + ph.luas(this));
        System.out.println("Hasil volume balok : " + ph.volume(this));
    }
}
