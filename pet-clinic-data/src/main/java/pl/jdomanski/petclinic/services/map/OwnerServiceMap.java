package pl.jdomanski.petclinic.services.map;

import org.springframework.stereotype.Service;

import pl.jdomanski.petclinic.model.Owner;
import pl.jdomanski.petclinic.services.CrudService;
import pl.jdomanski.petclinic.services.OwnerService;


@Service
public class OwnerServiceMap extends AbstractBaseMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
