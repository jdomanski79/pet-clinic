package pl.jdomanski.petclinic.services;

import java.util.Set;

import pl.jdomanski.petclinic.model.Pet;


public interface PetService {
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
