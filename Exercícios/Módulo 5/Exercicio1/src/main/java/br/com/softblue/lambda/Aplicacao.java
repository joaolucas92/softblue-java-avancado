package br.com.softblue.lambda;

import java.util.Arrays;
import java.util.List;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,4,6,2,5,8,7,9,0,3);
		
		lista.sort((n1, n2) -> -n1.compareTo(n2));
		
		lista.forEach(System.out::println);
	}

}
