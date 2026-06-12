import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {
	
	List<K> chaves = new ArrayList<>();
	List<V> valores = new ArrayList<>();
	
	public boolean put(K key, V value) {
		int index = 0;
		if (chaves.contains(key)) {
			for (int i = 0; i < chaves.size(); i++) {
				K k = chaves.get(i);
				if (k.equals(key)) {
					index = i;
				}
			}
			valores.set(index, value);
			return false;
		} else {
			chaves.add(key);
			valores.add(value);
			return true;
		}
	}
	
	
	public V get(K key) {
		int index = -1;
		for (int i = 0; i < chaves.size(); i++) {
			K k = chaves.get(i);
			if (k.equals(key)) {
				index = i;
			}
		}
		
		if (index < 0) {
			return null;
		}
		
		return valores.get(index);
	}
	
	public void clear() {
		chaves.clear();
		valores.clear();
	}
}
