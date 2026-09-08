package br.com.softblue.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Aplicacao {

	public static void main(String[] args) {

		Function<Integer, Integer> dobrar = (n) -> n * 2;
		Function<Integer, Integer> inverterSinal = (n) -> n * -1;
		Function<Integer, Integer> dobrarInverter = dobrar.andThen(inverterSinal);

		List<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(8);
		numeros.add(22);
		numeros.add(30);
		numeros.add(45);
		numeros.add(-28);
		numeros.add(-15);
		numeros.add(-58);

		// Lista Original
		numeros.forEach(System.out::println);
		System.out.println("------");

		// números dobrados
		List<Integer> numeros2 = transform(numeros, dobrar);
		numeros2.forEach(System.out::println);
		System.out.println("------");

		// números invertidos
		List<Integer> numeros3 = transform(numeros, inverterSinal);
		numeros3.forEach(System.out::println);
		System.out.println("------");

		// números dobrados e invertidos juntos
		List<Integer> numeros4 = transform(numeros, dobrarInverter);
		numeros4.forEach(System.out::println);
		System.out.println("------");

	}

	public static List<Integer> transform(List<Integer> lista, Function<Integer, Integer> funcao) {
		List<Integer> listaModificada = new ArrayList<>();
		for (Integer i : lista) {
			listaModificada.add(funcao.apply(i));
		}
		return listaModificada;
	}

}
