package pl.jdomanski.petclinic.services.map;

import pl.jdomanski.petclinic.model.Pet;
import pl.jdomanski.petclinic.services.CrudService;

public class PetServiceMap extends AbstractBaseMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

}
