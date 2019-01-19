package pl.jdomanski.petclinic.services.map;

import org.springframework.stereotype.Service;

import pl.jdomanski.petclinic.model.Vet;
import pl.jdomanski.petclinic.services.CrudService;

@Service
public class VetServiceMap extends AbstractBaseMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
	

}
