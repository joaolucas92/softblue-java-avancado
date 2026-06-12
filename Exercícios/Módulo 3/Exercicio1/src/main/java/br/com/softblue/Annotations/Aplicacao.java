package br.com.softblue.Annotations;

public class Aplicacao {
	
	public static void main(String[] args) throws Exception {
		
		Calculadora c1 = ObjectCreator.create(Calculadora.class);
		
		double soma = c1.somar();
		System.out.println(soma);
		
		double subtracao = c1.subtrair();
		System.out.println(subtracao);
		
		double multiplicacao = c1.multiplicar();
		System.out.println(multiplicacao);
		
		double divisao = c1.dividir();
		System.out.println(divisao);
	}

}
