package com.grimolizzi.hogwarts.wizards;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grimolizzi.hogwarts.GenericController;
import com.grimolizzi.hogwarts.GenericService;
import com.grimolizzi.hogwarts.model.Wizard;

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
