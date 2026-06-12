
public class Aplicacao {
	
	public static void main(String[] args) {
		
		Map<Integer, String> maps = new Map<>();
		Map<String, Integer> maps2 = new Map<>();
		
		maps.put(1, "Elemento 1");
		System.out.println(maps.get(1));
		maps.put(2, "Elemento 2");
		maps.put(3, "Elemento 3");
		maps.put(4, "Elemento 4");
		maps.put(5, "Elemento 5");
		maps.put(1, "Elemento novo");
		
		System.out.println(maps.get(1));
		System.out.println(maps.get(2));
		System.out.println(maps.get(3));
		System.out.println(maps.get(4));
		System.out.println(maps.get(5));
		System.out.println(maps.get(6));
		
		maps.clear();
		
		System.out.println(maps.get(1));
		System.out.println(maps.get(2));
		System.out.println(maps.get(3));
		System.out.println(maps.get(4));
		System.out.println(maps.get(5));
		
		maps2.put("Chave 1", 1);
		maps2.put("Chave 2", 2);
		maps2.put("Chave 3", 3);
		maps2.put("Chave 4", 4);
		
		System.out.println(maps2.get("Chave 1"));
		System.out.println(maps2.get("Chave 2"));
		System.out.println(maps2.get("Chave 3"));
		System.out.println(maps2.get("Chave 4"));
		System.out.println(maps2.get("Chave 5"));
		
		maps2.put("Chave 1", 50);
		System.out.println(maps2.get("Chave 1"));
		
		maps2.clear();
		System.out.println(maps2.get("Chave 1"));
		System.out.println(maps2.get("Chave 2"));
		System.out.println(maps2.get("Chave 3"));
		System.out.println(maps2.get("Chave 4"));
	}

}
