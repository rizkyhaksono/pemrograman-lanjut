/*
@author: rizkyhaksono
 */

package com.rizky.pratikum1;

import java.util.Scanner;

public class Pratikum1_2 {

    Scanner scn = new Scanner(System.in);
    private String nimMhs;


    public String getNimMhs() {
        return nimMhs;
    }

    public void setNimMhs() {

        try {
            System.out.print("Masukkan NIM Anda: ");
            nimMhs = scn.nextLine();

            String nim = nimMhs.substring(4, 12);
            String num = "10370311";

            if (!nim.equals(num)) {
                throw new Exception("NIM informatika harus memiliki kode 10370311");
            } else if (nimMhs.length() > 15) {
                throw new Exception("NIM tidak boleh lebih dari 15 karakter");
            } else if (nimMhs.length() < 15) {
                throw new Exception("NIM tidak boleh kurang dari 15 karakter");
            }


        } catch (Exception e) {
            System.out.println("Error: " + e);

            setNimMhs();
        }
    }

        public static void main(String[] args) {

        Pratikum1_2 p1 = new Pratikum1_2();
        p1.setNimMhs();
        System.out.println("NIM Anda: " + p1.getNimMhs());

    }
}
