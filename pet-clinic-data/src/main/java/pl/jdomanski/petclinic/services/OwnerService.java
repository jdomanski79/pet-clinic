package pl.jdomanski.petclinic.services;

import pl.jdomanski.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
	
}
