package com.grimolizzi.hogwarts.wizards;

import com.grimolizzi.hogwarts.GenericController;
import com.grimolizzi.hogwarts.GenericService;
import com.grimolizzi.hogwarts.model.Wizard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wizards")
public class WizardController extends GenericController<Wizard> {

	public WizardController(GenericService<Wizard> service) {
		super(service, Wizard.class);
	}
}
