package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Autores;
import com.proytaller.Repos.AutoresRepo;

@RestController
public class AutoresController {
	@Autowired
	AutoresRepo autoresrepo;
	@GetMapping({"api/apiautores"})
	public List<Autores> listadeautores(){
		return autoresrepo.findAll();
	}

}
