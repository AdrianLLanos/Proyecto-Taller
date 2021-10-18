package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Datos;
import com.proytaller.Repos.DatosRepo;

@RestController
public class DatoController {

	@Autowired
	DatosRepo datosrepos;

	@GetMapping({ "apidatos" })
	public List<Datos> listadedatos() {
		return datosrepos.findAll();
	}
}
