package pl.jdomanski.petclinic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class IndexController {

	public String index() {
		return "index";
	}
}
