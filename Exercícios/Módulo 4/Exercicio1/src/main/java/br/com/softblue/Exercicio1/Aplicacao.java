package br.com.softblue.Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(31);
		numeros.add(14);
		numeros.add(56);
		numeros.add(9);
		numeros.add(40);
		numeros.add(22);
		System.out.println("Method-Local antes de ordenar: " + numeros);
		
		List<Integer> numeros2 = new ArrayList<>();
		numeros2.addAll(numeros);
		System.out.println("Anonymous antes de ordenar: " + numeros2);
		
		//Utilizando Method-Local Inner Class
		class MethodLocal {
			public void ordenar(List<Integer> lista) {
				Collections.sort(lista);
				System.out.println("Method-Local depois de ordenar: " + lista);
			}
		}
		
		MethodLocal innerMethodLocal = new MethodLocal();
		innerMethodLocal.ordenar(numeros);
		
		//Utilizando anonymous inner class
		Collections.sort(numeros2, new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				return n1 - n2;
			}
		});
		
		System.out.println("Anonymous depois de ordenar: " + numeros2);
		
		InnerEstatica apInner = new InnerEstatica();
		apInner.ordenar();
		
		
	}
	
	//Utilizando static inner class
	static class InnerEstatica {
		
		private List<Integer> listaStatic;
		
		public void ordenar() {
			listaStatic = new ArrayList<>();
			listaStatic.add(31);
			listaStatic.add(14);
			listaStatic.add(56);
			listaStatic.add(9);
			listaStatic.add(40);
			listaStatic.add(22);
			System.out.println("Static inner antes de ordenar: " + listaStatic);
			
			Collections.sort(listaStatic);
			System.out.println("Static inner depois de ordenar: " + listaStatic);
		}
	}

}
