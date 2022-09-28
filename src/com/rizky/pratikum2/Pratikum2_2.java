//package com.rizky.pratikum2;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Pratikum2_2 {
//
////    void cekDate (int date), cekFrom (char from), cekName (char name), list();
//
//    static String[][] book = {{"This is Book, Malang.2022"}};
//    static String[][] place = {{"Malang"}, {"Bandung"}, {"Surabaya"}};
//
//    static void cekDate(int date) {
//        if (date < 2018 || date > 2022) {
//
//        }
//    }
//
//    static void cekFrom(String from) {
//        for (int i = 0; place[i][0] != null; i++) {
//            if (from.compareTo(Arrays.toString(place[i])) == 0) {
//                return;
//            }
//        }
//
//    }
//
//    static void cekName(String name) {
//        for (int i = 0; book[i][0] != null; i++) {
//            if (name.compareTo(Arrays.toString(book[i])) == 0) {
//                return;
//            }
//        }
//    }
//
//    void list() {
//        for (int i = 0; book[i][0] != null; i++) {
//            System.out.println(Arrays.toString(book[i]));
//        }
//    }
//
//    public static void main(String[] args) {
//        String inName, inFrom, inDate;
//        int inIndex = 0;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome to Library");
//
//        System.out.println("Nama : ");
//        inName = input.nextLine();
//        cekName(String.valueOf(inName));
//
//        System.out.println("From : ");
//        inFrom = input.nextLine();
//        cekFrom(String.valueOf(inFrom));
//
//        System.out.println("Date : ");
//        inDate = input.nextLine();
//        cekDate(Integer.parseInt(inDate));
//
//        System.out.println(inName + "" + inFrom + "" + inDate);
//        book[1] = new String[inIndex];
//
//        System.out.println("Buku berhasil ditambahan");
//    }
//
//
//}
