package pl.jdomanski.petclinic.services.map;

import org.springframework.stereotype.Service;

import pl.jdomanski.petclinic.model.Vet;
import pl.jdomanski.petclinic.services.CrudService;
import pl.jdomanski.petclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractBaseMapService<Vet, Long> implements VetService{

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
	

}
