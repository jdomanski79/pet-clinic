package pl.jdomanski.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import pl.jdomanski.petclinic.model.Owner;
import pl.jdomanski.petclinic.model.Vet;
import pl.jdomanski.petclinic.services.OwnerService;
import pl.jdomanski.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setFirstName("Agnieszka");
		owner1.setLastName("Domanska");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Magdalena");
		owner2.setLastName("Domanska");

		ownerService.save(owner2);
		
		System.out.println("Owners loaded..");

		Vet vet1 = new Vet();

		vet1.setFirstName("Zofia");
		vet1.setLastName("Domanska");

		vetService.save(vet1);

		Vet vet2 = new Vet();

		vet2.setFirstName("Helena");
		vet2.setLastName("Pawlus");

		vetService.save(vet2);

		System.out.println("Vets loaded");
	}

}
