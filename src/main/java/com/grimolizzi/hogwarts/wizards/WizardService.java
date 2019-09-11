package com.grimolizzi.hogwarts.wizards;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grimolizzi.hogwarts.GenericService;
import com.grimolizzi.hogwarts.model.House;
import com.grimolizzi.hogwarts.model.Wizard;

@Service
public class WizardService implements GenericService<Wizard> {
	
	private List<Wizard> wizardList;
	
	public WizardService() {
		this.wizardList = new ArrayList<>();
		this.wizardList.add(new Wizard("001", "Ron", "Weasley", House.GRYFFINDOR));
		this.wizardList.add(new Wizard("002", "Severus", "Piton", House.SLYTHERIN));
	}
	
	@Override
	public List<Wizard> getAll() {
		
		return this.wizardList;
	}

	@Override
	public Wizard get(String id) {

		Optional<Wizard> matchingObject = this.wizardList.stream()
				.filter(wizard -> wizard.getId().equals(id))
				.findFirst();
		
		return matchingObject.orElse(null);
	}

	@Override
	public void create(Wizard wizard) {
		this.wizardList.add(wizard);		
	}
}
