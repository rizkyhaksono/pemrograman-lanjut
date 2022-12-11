/**
 @author: rizkyhaksono
 */

package com.rizky.praktikum3;

public class Perhitungan {

    int luas(Balok sisi) {
        return sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    };

    int volume(Balok sisi) {
        return 4 * (sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi());
    };

    static boolean isCube(long input) {
        long round = Math.round(Math.cbrt(input));
        return (round
                * round
                * round == input);
    }

}
