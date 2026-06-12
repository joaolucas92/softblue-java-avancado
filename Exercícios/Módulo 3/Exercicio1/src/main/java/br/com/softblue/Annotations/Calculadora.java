package br.com.softblue.Annotations;

public class Calculadora {
	
	private double num1;
	private double num2;
	
	@Init(runOnInstantation = true)
	public void init() {
		this.num1 = 10.0;
		this.num2 = 25.0;
	}

	public double somar() {
		return num1 + num2;
	}
	
	public double subtrair() {
		return num1 - num2;
	}
	
	public double multiplicar() {
		return num1 * num2;
	}
	
	public double dividir() {
		return num1 / num2;
	}

}
