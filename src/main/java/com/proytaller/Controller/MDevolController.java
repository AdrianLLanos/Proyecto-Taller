package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.MDevol;
import com.proytaller.Repos.MDevolRepo;

@RestController
public class MDevolController {
	@Autowired
	private MDevolRepo mdevolrepo;
	@GetMapping({"api/apimdevol"})
	private List<MDevol>listademdevol(){
		return mdevolrepo.findAll();
	}

}
