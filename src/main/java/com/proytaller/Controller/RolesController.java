package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Roles;
import com.proytaller.Repos.RolesRepo;

@RestController
public class RolesController {
	@Autowired
	private RolesRepo rolesrepo;

	@GetMapping({ "api/apiroles" })
	private List<Roles> listaderoles() {
		return rolesrepo.findAll();
	}

}
