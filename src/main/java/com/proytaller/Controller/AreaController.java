package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Areas;
import com.proytaller.Repos.AreasRepo;


@RestController
public class AreaController {
	@Autowired
	private AreasRepo arearepo;

	@GetMapping({ "apiareas" })
	private List<Areas> listadeareas() {
		return arearepo.findAll();
	}

}
