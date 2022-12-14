/**
 @author: rizkyhaksono
 */

package com.rizky.praktikum5;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class temp {

    public void method() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            Object pp = response.body();
            System.out.println(pp);
        } else {
            System.out.println("Response 404");
        }
    }

        public static void main(String[] args){

            temp tmp = new temp();
            try {
                tmp.method();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
}
