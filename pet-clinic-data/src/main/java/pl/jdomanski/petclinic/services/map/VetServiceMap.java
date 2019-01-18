package pl.jdomanski.petclinic.services.map;

import pl.jdomanski.petclinic.model.Vet;
import pl.jdomanski.petclinic.services.CrudService;

public class VetServiceMap extends AbstractBaseMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
	

}
