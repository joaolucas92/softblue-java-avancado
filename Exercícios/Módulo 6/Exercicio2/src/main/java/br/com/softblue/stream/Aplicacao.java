package br.com.softblue.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {
	
	private static int contador = 1;
	
	public static void main(String[] args) {
		
		List<String> cores = Arrays.asList("Azul", "Branco", "Preto", "Preto", "Amarelo", "Azul");
		
		List<Papel> listaPapel = cores.stream()
				.map(c -> new Papel(contador++ , Papel.Cor.valueOf(c)))
				.collect(Collectors.toList());
		
		listaPapel.forEach(l -> System.out.println(String.format("%d: %s", l.getId(), l.getCor())));
	}

}
