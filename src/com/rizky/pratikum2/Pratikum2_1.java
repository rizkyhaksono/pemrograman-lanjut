/*
@author: rizkyhaksono
 */

package com.rizky.pratikum2;

import java.util.Scanner;

public class Pratikum2_1 {

    Scanner scn = new Scanner(System.in);
    private String nimMhs;
    String email, name, telp;

    // getter & setter
    public String getNimMhs() {
        return nimMhs;
    }
    public String getEmailMhs() { return email; }
    public String getNameMhs() { return name; }
    public String getTelpMhs() { return telp; }

    public void setNimMhs() {

        try {
            System.out.print("Masukkan NIM anda : ");
            nimMhs = scn.nextLine();

            String nim = nimMhs.substring(4, 12);
            String cekNim = "10370311";

            if (!nim.equals(cekNim)) {
                throw new Exception("NIM informatika harus memiliki kode 10370311");
            } else if (nimMhs.length() > 15) {
                throw new Exception("NIM tidak boleh lebih dari 15 karakter");
            } else if (nimMhs.length() < 15) {
                throw new Exception("NIM tidak boleh kurang dari 15 karakter");
            }


        } catch (Exception e) {
            System.out.println("Error : " + e);

            setNimMhs();
        }
    }

    public void setEmailMhs() {

        try {
            System.out.print("Masukkan email anda : ");
            email = scn.nextLine();

            String mail = email.substring(email.length() -18);
            String cekEmail = "@webmail.umm.ac.id";

            if (!mail.equals(cekEmail)) {
                throw new Exception("Masukkan alamat domain umm dengan benar");
            }

        } catch (Exception e) {
            System.out.println("Error :" + e);

            setEmailMhs();
        }
    }

    public void setNameMhs() {

        try {
            System.out.print("Masukkan nama anda : ");
            name = scn.nextLine();

        } catch (Exception e) {
            System.out.println("Error : " + e);

            setNameMhs();
        }
    }

    public void setTelpMhs() {

        try {
            System.out.print("Masukkan no telpon anda : ");
            telp = scn.nextLine();

            if (telp.length() > 15) {
                throw new Exception("Nomor telpon tidak boleh lebih 15 karakter");
            }

        } catch (Exception e) {
            System.out.println("Error : " + e);

            setTelpMhs();
        }
    }

    public static void main(String[] args) {

        Pratikum2_1 p2 = new Pratikum2_1();

        p2.setNimMhs();
        System.out.println("NIM anda : " + p2.getNimMhs());

        p2.setEmailMhs();
        System.out.println("Email anda : " + p2.getEmailMhs());

        p2.setNameMhs();
        System.out.println("Nama anda : " + p2.getNameMhs());

        p2.setTelpMhs();
        System.out.println("Telpon anda : " + p2.getTelpMhs());
    }
}
