package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// Convenção JAVA
		int idade;
		String nome;
		String nomeDoMeuCachorro = "Negão";
		String ano2014;
		
		// Aceito, mas não utilizado
		int _idade;
		int $idade;
		
		// Não é convenção JAVA
		String nome_do_meu_chachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		// Má prática
		int a = 10;
		String b = "Loiane";
		
		
		idade = 35;
		nome = "Wallace Oliveira";
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		System.out.println("Cachorro: " + nomeDoMeuCachorro);

	}

}
