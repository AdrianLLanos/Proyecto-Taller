package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Rolme;
import com.proytaller.Repos.RolmeRepo;

@RestController
public class RolmeController {
	@Autowired
	private RolmeRepo rolmerepo;

	@GetMapping({ "api/apirolme" })
	private List<Rolme> listaderolme() {
		return rolmerepo.findAll();
	}

}
