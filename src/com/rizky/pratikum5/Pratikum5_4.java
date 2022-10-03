package com.rizky.pratikum5;

import java.util.Scanner;

public class Pratikum5_4 {

    public static void main(String[] args) {
        String question = "Jelaskan kepada asisten perbedaan antara API dan Library dengan bahasa kamu sendiri !";

        System.out.println(question);

        Scanner scn = new Scanner(System.in);

        String answer;
        System.out.print("Jawaban : ");
        answer = scn.nextLine();

        System.out.println("Jawaban kamu : " + answer);
    }
}
