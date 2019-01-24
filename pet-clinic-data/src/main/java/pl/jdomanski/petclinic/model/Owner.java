package pl.jdomanski.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person{
	
	Set<Pet> pets = new HashSet<>();

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

}
