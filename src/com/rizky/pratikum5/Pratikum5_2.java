/*
@author: rizkyhaksono
 */

package com.rizky.pratikum5;

// java library

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Pratikum5_2 {

    public void method() throws IOException, InterruptedException {

        // URL url = new URL("https://jsonplaceholder.typicode.com/users");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            Object pp = response.body();

            System.out.println(pp);
        } else {
            System.out.println("Response 404");
        }

    }

    public static void main(String[] args) {

        Pratikum5_2 p5 = new Pratikum5_2();
        try {
            p5.method();
        } catch (IOException | InterruptedException e ) {
            e.printStackTrace();
        }

//        Scanner scn = new Scanner(System.in);
//
//        int temp, size;
//
//        System.out.print("Masukkan berapa array : ");
//        size = scn.nextInt();
//
//        int[] data = new int[size];
//
//        System.out.print("Masukkan data : ");
//        for (int i = 0; i < size; i++) {
//            data[i] = scn.nextInt();
//        }
//
//        for (int i = 0; i < data.length; i++) {
//            for (int j = i + 1; j < data.length; j++) {
//                if (data[i] > data[j]) {
//                    temp = data[i];
//                    data[i] = data[j];
//                    data[j] = temp;
//                }
//            }
//        }
//
//        System.out.println("Hasil : ");
//        for (int datum : data) {
//            System.out.print(datum + " | ");
//        }
//
//        // search index of array
//        System.out.print("\nMasukkan data yang ingin dicari : ");
//        int search = scn.nextInt();
//        int index = -1;
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] == search) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index != -1) {
//            System.out.println("Data tidak ditemukan");
//        } else {
//            System.out.println("Data ditemukan pada index ke-" + index);
//        }

    }
}
