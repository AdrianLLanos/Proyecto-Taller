package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Tipos;
import com.proytaller.Repos.TiposRepo;

@RestController
public class TiposController {
	@Autowired
	private TiposRepo tiposrepo;
	@GetMapping({"apitipos"})
	private List<Tipos> listatipos(){
		return tiposrepo.findAll();

	}
	
}
