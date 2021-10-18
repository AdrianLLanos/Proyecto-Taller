package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.editoriales;
import com.proytaller.Repos.EditorialesRepo;

@RestController

public class EditorialesController {
	@Autowired
	private EditorialesRepo editorepo;

	@GetMapping({ "apieditoriales" })
	private List<editoriales> listaeditoriales() {
		return editorepo.findAll();
	}

}
