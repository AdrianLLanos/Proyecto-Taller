package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Usuarios;
import com.proytaller.Repos.UsuariosRepo;

@RestController
public class UsuariosController {
	@Autowired
	private UsuariosRepo usuariosrepo;

	@GetMapping({ "api/apiusuarios" })
	private List<Usuarios> listausuarios() {
		return usuariosrepo.findAll();
	}

}
