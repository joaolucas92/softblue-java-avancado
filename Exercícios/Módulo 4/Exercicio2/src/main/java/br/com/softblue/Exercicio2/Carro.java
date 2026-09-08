package br.com.softblue.Exercicio2;

public class Carro {
	
	private Motor motor = new Motor();
	
	public void ligarMotor() {
		motor.ligar();
	}

	private class Motor {
		
		@SuppressWarnings("unused")
		private boolean ligado;
		
		public void ligar() {
			ligado = true;
			System.out.println("O carro deu partida.");
		}
	}

}
