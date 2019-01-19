package pl.jdomanski.petclinic.services.map;

import org.springframework.stereotype.Service;

import pl.jdomanski.petclinic.model.Pet;
import pl.jdomanski.petclinic.services.CrudService;
import pl.jdomanski.petclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractBaseMapService<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

}
