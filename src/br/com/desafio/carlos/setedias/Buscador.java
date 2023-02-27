package br.com.desafio.carlos.setedias;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.stream.Stream;

public class Buscador {

	public static void main(String[] args) throws IOException, InterruptedException {
		String key = "k_nv2qgky6";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://imdb-api.com/en/API/Top250Movies/" + key))
				.build();

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println(response.body());
		

	}
}
