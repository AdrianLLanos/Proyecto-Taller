package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Escriben;
import com.proytaller.Repos.EscribenRepo;

@RestController
public class EscribenController {
	@Autowired
	private EscribenRepo escribenrepo;

	@GetMapping({ "api/apiescriben" })
	private List<Escriben> listaescriben() {
		return escribenrepo.findAll();
	}

}
