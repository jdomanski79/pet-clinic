package pl.jdomanski.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import pl.jdomanski.petclinic.model.BaseEntity;

public abstract class AbstractBaseMapService<T extends BaseEntity, ID> {
	
	protected Map<Long, T> map = new HashMap<>();
	
	public T save(ID id, T object) {
		
		if(object != null) {
			if(object.getId() != null) {
				object.setId(getNextId());
			}
		}
		
		map.put(object.getId(), object);
		
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
	
	private Long getNextId() {
		return (long) (map.size() + 1);
	}
}
