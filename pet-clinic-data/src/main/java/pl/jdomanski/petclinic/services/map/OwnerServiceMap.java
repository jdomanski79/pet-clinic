package pl.jdomanski.petclinic.services.map;

import pl.jdomanski.petclinic.model.Owner;
import pl.jdomanski.petclinic.services.CrudService;


public class OwnerServiceMap extends AbstractBaseMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
	
}
