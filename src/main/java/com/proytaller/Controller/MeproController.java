package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Mepro;
import com.proytaller.Repos.MeproRepo;

@RestController
public class MeproController {
	@Autowired
	private MeproRepo meprorepo;

	@GetMapping({"api/apimepro"})
	private List<Mepro> listademepro(){
		return meprorepo.findAll();
	}
	

}
