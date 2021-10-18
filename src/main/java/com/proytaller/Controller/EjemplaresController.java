package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Ejemplares;
import com.proytaller.Repos.EjemplaresRepo;

@RestController
public class EjemplaresController {
	@Autowired
	private EjemplaresRepo ejemplaresrepo;
	@GetMapping({"api/apiejemplares"})
	private List<Ejemplares> listadeusuarios(){
		return ejemplaresrepo.findAll();
	}

}
