package com.br.SevenDaysOfCode;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Requisicao {
	private String key;
	private String Url;

	public String requisicao(String key, String Url) throws IOException, InterruptedException {
		
		HttpClient cliente = HttpClient.newHttpClient();
		
		HttpRequest requisicao = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create(Url+key))
				.build();
		HttpResponse<String> resposta = cliente.send(requisicao, BodyHandlers.ofString());
		
		return resposta.body();
	}

}
