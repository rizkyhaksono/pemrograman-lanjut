/*
@author: rizkyhaksono
 */

package com.rizky.pratikum3;

public class Perhitungan {

    int luas(Balok sisi) {
        return sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    };
    int volume(Balok sisi) {
        return 4 * (sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi());
    };

//    static boolean isCube(long input) {
//        return Math.round(Math.cbrt(input)) *
//                Math.round(Math.cbrt(input)) *
//                Math.round(Math.cbrt(input)) == input;
//    }
    static boolean isCube(long input) {
        boolean extractVariable = Math.round(Math.cbrt(input)) *
                Math.round(Math.cbrt(input)) *
                Math.round(Math.cbrt(input)) == input;
        return extractVariable;
    }

}
