package pl.jdomanski.petclinic.services.map;

import org.springframework.stereotype.Service;

import pl.jdomanski.petclinic.model.Owner;
import pl.jdomanski.petclinic.services.CrudService;


@Service
public class OwnerServiceMap extends AbstractBaseMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
	
}
