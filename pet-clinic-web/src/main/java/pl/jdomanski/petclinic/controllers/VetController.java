package pl.jdomanski.petclinic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class VetController {

	public String listVets() {
		return "vets/index";
	}
}
