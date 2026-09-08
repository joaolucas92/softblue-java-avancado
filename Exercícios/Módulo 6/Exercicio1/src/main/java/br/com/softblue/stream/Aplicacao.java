package br.com.softblue.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {

	public static void main(String[] args) {
		
		List<Integer> angulosGraus = Arrays.asList(90, 30, 60, 45, 180);
		
		List<Double> angulosRadianos = angulosGraus.stream()
				.map(Math::toRadians)
				.collect(Collectors.toList());
		
		angulosRadianos.forEach(System.out::println);

	}
}
