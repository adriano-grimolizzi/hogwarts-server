package com.grimolizzi.Hogwarts.wizards;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grimolizzi.Hogwarts.GenericController;
import com.grimolizzi.Hogwarts.GenericService;
import com.grimolizzi.Hogwarts.model.Wizard;

@RestController
@RequestMapping("/wizards")
public class WizardController extends GenericController<Wizard> {

	public WizardController(GenericService<Wizard> service) {
		super(service);
	}
		
	@PostMapping()
	public void create(@RequestBody Wizard t) {
		super.service.create(t);
	}
}
