package com.grimolizzi.Hogwarts;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericController<T> {
	
	protected GenericService<T> service;
	
	public GenericController(GenericService<T> service) {
		this.service = service;
	}
	
	@GetMapping()
	public List<T> get(@RequestParam(required = false) String id) {
		if (id != null) {
			return Arrays.asList(this.service.get(id));
		} else {
			return this.service.getAll();
		}
	}
}