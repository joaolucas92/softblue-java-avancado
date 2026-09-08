package br.com.softblue.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {

	private static List<String> numeros = new ArrayList<>();
	
	public static void main(String[] args) {

		numeros.add("5");
		numeros.add("31");
		numeros.add("22");
		numeros.add("14");
		numeros.add("9");
		numeros.add("30");
		numeros.add("18");
		
		executar1();
		executar2();
		executar3();
		
	}
	
	private static void executar1() {
		int soma = numeros.stream()
			.collect(Collectors.summingInt(n -> Integer.parseInt(n)));
		
		System.out.println(soma);
	}
	
	private static void executar2() {
		int soma = numeros.stream()
			.map(n -> Integer.parseInt(n))
			.collect(Collectors.summingInt(n -> n));
		System.out.println(soma);
	}
	
	private static void executar3() {
		int soma = numeros.stream()
			.mapToInt(Integer::parseInt)
			.sum();
		
		System.out.println(soma);
	}

}
