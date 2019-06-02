package com.clinico.lab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clinico.lab.models.entities.CabeceraHistorial;
import com.clinico.lab.models.services.CabeceraHistorialService;

	@RestController
	@RequestMapping("/lab/cabecerahistorial")

public class CabeceraHistoriaController {

	@Autowired
	private CabeceraHistorialService cabeceraHistorialService;
	
	@RequestMapping(value= "/listar", method=RequestMethod.GET)
		public List<CabeceraHistorial> listar(){
		return cabeceraHistorialService.findAll(); 
		
				}
}
