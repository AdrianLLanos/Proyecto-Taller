package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Procesos;
import com.proytaller.Repos.ProcesosRepo;

@RestController
public class ProcesosController {
	@Autowired
	private ProcesosRepo procesosrepo;

	@GetMapping({"api/apiprocesos"})
	private List<Procesos> listadeprocesos(){
		return procesosrepo.findAll();
	}

}
