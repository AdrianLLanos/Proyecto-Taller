package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.DPrestamo;
import com.proytaller.Repos.DPrestamoRepo;

@RestController
public class DPrestamoController {
	@Autowired
	private DPrestamoRepo dprestamorepo;

	@GetMapping({ "api/apidprestamo" })
	private List<DPrestamo> listadedprestamo() {
		return dprestamorepo.findAll();
	}

}
