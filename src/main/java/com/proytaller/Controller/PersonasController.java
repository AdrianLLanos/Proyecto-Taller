package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.PersonasModel;
import com.proytaller.Repos.PersonasRepo;

@RestController
public class PersonasController {
	@Autowired
	private PersonasRepo perrepo;

	@GetMapping({ "api/apipersonas" })
	private List<PersonasModel> listadepersonas() {
		return perrepo.findAll();
	}

}
