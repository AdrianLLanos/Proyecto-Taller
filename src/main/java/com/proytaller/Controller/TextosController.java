package com.proytaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proytaller.Model.Textos;
import com.proytaller.Repos.TextosRepo;

@RestController
public class TextosController {
   @Autowired
   private TextosRepo textosrepo;

	@GetMapping({"apitextos"})
   private List<Textos> listadetelefonos(){
	   return textosrepo.findAll();
   }

}
