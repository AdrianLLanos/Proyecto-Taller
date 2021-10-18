package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Rolusu;
import com.proytaller.Repos.RolusuRepo;

@RestController
public class RolusuController {
	@Autowired
	private RolusuRepo rolusurepo;

	@GetMapping({ "api/apirolusu" })
	private List<Rolusu> listaderolusu() {
		return rolusurepo.findAll();
	}

}
