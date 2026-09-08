package br.com.softblue.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Function<String, String> maiusculas = e -> e.toUpperCase();
		Function<Double, Double> arredondarBaixo = e -> Math.floor(e);
		
		List<String> nomes = new ArrayList<>();
		nomes.add("João");
		nomes.add("neuza");
		nomes.add("vanDerlei");
		nomes.add("maria");
		nomes.add("Bianca");
		
		List<String> nomes2 = transform(nomes, maiusculas);
		nomes2.forEach(System.out::println);
		
		List<Double> numeros = new ArrayList<>();
		numeros.add(10.4);
		numeros.add(7.8);
		numeros.add(15.0);
		numeros.add(22.5);
		numeros.add(17.2);
		
		List<Double> numeros2 = transform(numeros, arredondarBaixo);
		numeros2.forEach(System.out::println);
		
	}
	
	public static <T> List<T> transform(List<T> lista, Function<T, T> funcao) {
		List<T> listaModificada = new ArrayList<>();
		for (T i : lista) {
			listaModificada.add(funcao.apply(i));
		}
		return listaModificada;
	}
}
