package pl.jdomanski.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractBaseMapService<T, ID> {
	
	protected Map<ID, T> map = new HashMap<>();
	
	public T save(ID id, T object) {
		map.put(id, object);
		
		return object;
	}
	
	public T findById(ID id) {
		return map.get(id);
	}
	
	public Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	public void delete (T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
}
