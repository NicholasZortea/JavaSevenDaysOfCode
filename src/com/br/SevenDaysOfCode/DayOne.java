package com.br.SevenDaysOfCode;

import java.io.IOException;
import java.util.Scanner;

public class DayOne {

	public static void main(String[] args) throws IOException, InterruptedException {
		Requisicao requisicao = new Requisicao();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a chave para realizar a requisição a api do IMDB:");
		String Chave = scanner.next();
		String saidaDaRequisicao = requisicao.requisicao(Chave, "https://imdb-api.com/en/API/Top250Movies/");
		System.out.println(saidaDaRequisicao);
	}

}
