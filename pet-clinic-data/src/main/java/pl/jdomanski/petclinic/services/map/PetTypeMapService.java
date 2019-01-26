package pl.jdomanski.petclinic.services.map;

import org.springframework.stereotype.Service;

import pl.jdomanski.petclinic.model.PetType;
import pl.jdomanski.petclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractBaseMapService<PetType, Long> implements PetTypeService{

}
