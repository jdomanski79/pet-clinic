package pl.jdomanski.petclinic.services;

import java.util.Set;

import pl.jdomanski.petclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	Vet findByLastName(String lastName);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
