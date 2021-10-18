package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.DDevol;
import com.proytaller.Repos.DDevolRepo;

@RestController
public class DDevolController {
	@Autowired
	private DDevolRepo ddevolrepo;
	@GetMapping({"api/apiddevol"})
	private List<DDevol> listaddevol(){
		return ddevolrepo.findAll();
	}
	

}
