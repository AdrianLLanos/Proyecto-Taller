package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Telefonos;
import com.proytaller.Repos.TelefonosRepo;

@RestController
public class TelefonosController {
	@Autowired
	private TelefonosRepo telfrepo;

	@GetMapping({ "api/apitelefonos" })
	private List<Telefonos> listatelefonos() {
		return telfrepo.findAll();
	}

}
