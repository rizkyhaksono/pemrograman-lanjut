package com.rizky.pratikum5;

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

    }
}
