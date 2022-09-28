package com.rizky.pratikum5;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Pratikum5_2 {

    public void method() throws IOException, InterruptedException, ParseException {

//    URL url = new URL("https://jsonplaceholder.typicode.com/users");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response);

        Object pp = response.body();
        System.out.println(pp);

    }

    public static void main(String[] args) {

        Pratikum5_2 p5 = new Pratikum5_2();
        try {
            p5.method();
        } catch (IOException | InterruptedException | ParseException e) {
            e.printStackTrace();
        }

    }
}
