package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Menus;
import com.proytaller.Repos.MenusRepo;

@RestController
public class MenusController {
	@Autowired
	private MenusRepo menusrepo;

	@GetMapping({ "api/apimenus" })
	private List<Menus> listademenus() {
		return menusrepo.findAll();
	}

}
