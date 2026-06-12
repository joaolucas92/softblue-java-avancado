package br.com.softblue.Annotations;

public class Aplicacao {
	
	public static void main(String[] args) throws Exception {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		Property.set(p1, "nome", "João Lucas");
		Property.set(p1, "idade", 33, int.class);
		Property.set(p1, "sexo", "Masculino");
		System.out.println(p1);
		
		Property.set(p2, "nome", "Neuza");
		Property.set(p2, "idade", 65, int.class);
		Property.set(p2, "sexo", "Feminino");
		System.out.println(p2);
		
		Property.set(p3, "nome", "Vanderlei");
		Property.set(p3, "idade", 64, int.class);
		Property.set(p3, "sexo", "Masculino");
		System.out.println(p3);
		
		String nome1 = Property.get(p1, "nome", String.class);
		System.out.println(nome1);
		int idade1 = Property.get(p1, "idade", Integer.class);
		System.out.println(idade1);
		String sexo1 = Property.get(p1, "sexo", String.class);
		System.out.println(sexo1);
		
		String nome2 = Property.get(p2, "nome", String.class);
		System.out.println(nome2);
		int idade2 = Property.get(p2, "idade", Integer.class);
		System.out.println(idade2);
		String sexo2 = Property.get(p2, "sexo", String.class);
		System.out.println(sexo2);
		
		String nome3 = Property.get(p3, "nome", String.class);
		System.out.println(nome3);
		int idade3 = Property.get(p3, "idade", Integer.class);
		System.out.println(idade3);
		String sexo3 = Property.get(p3, "sexo", String.class);
		System.out.println(sexo3);
	}

}
