/*
@author: rizkyhaksono
 */

package com.rizky.pratikum3;

public class Balok {

    private int panjang, lebar, tinggi;


    public void setPanjang(int setPanjang) {
        this.panjang = setPanjang;
    }

    public void setLebar(int setLebar) {
        this.lebar = setLebar;
    }

    public void setTinggi(int setTinggi) {
        this.tinggi = setTinggi;
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
