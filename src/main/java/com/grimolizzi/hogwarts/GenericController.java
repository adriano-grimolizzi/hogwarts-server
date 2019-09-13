package com.grimolizzi.hogwarts;

import com.google.gson.Gson;
import com.grimolizzi.hogwarts.model.Wizard;
import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class GenericController<T> {

	private GenericService<T> service;
	protected Class<T> type;

	@SuppressWarnings("unchecked")
	public GenericController(GenericService<T> service, Class<Wizard> type) {
		this.service = service;
		this.type = (Class<T>) type;
	}

	@GetMapping()
	public List<T> get(@RequestParam(required = false) String id) {
		if (id != null) {
			return Collections.singletonList(this.service.get(id));
		} else {
			return this.service.getAll();
		}
	}

	@PostMapping()
	public void create(@RequestBody String json) {

		T t = new Gson().fromJson(json, this.type);

		this.service.create(t);
	}
}
