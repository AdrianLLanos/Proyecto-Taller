package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.MPrestamo;
import com.proytaller.Repos.MPrestamoRepo;

@RestController
public class MPrestamoController {
	@Autowired
	private MPrestamoRepo mprestamorepo;

	@GetMapping ({"api/apimprestamo"})
	private List<MPrestamo> listademprestamo(){
		return mprestamorepo.findAll();
		
	}
	

}
