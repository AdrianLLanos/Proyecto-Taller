package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.TipoTex;
import com.proytaller.Repos.TipoTexRepo;

@RestController
public class TipoTexController {
	@Autowired
	private TipoTexRepo tipotexrepo;

	@GetMapping({ "apitipotex" })
	private List<TipoTex> listatipotex() {
		return tipotexrepo.findAll();
	}

}
