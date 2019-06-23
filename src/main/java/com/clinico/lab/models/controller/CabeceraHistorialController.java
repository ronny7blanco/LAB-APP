package com.clinico.lab.models.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.clinico.lab.models.entities.CabeceraHistorial;
import com.clinico.lab.models.services.CabeceraHistorialService;
import com.clinico.lab.models.services.ICabeceraHistorialService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/cabecera_hist")
public class CabeceraHistorialController {

	public static final Logger Logger = LoggerFactory.getLogger(CabeceraHistorialController.class);

	@Autowired
	private ICabeceraHistorialService cabeceraHistorialService;
	
	@RequestMapping("")
	private List<CabeceraHistorial> findAll(){
		return cabeceraHistorialService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public CabeceraHistorial getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching CabeceraHistorial with id {}", id);

		Optional<CabeceraHistorial> cabeceraHistorial = cabeceraHistorialService.findBy(id);
		if (!cabeceraHistorial.isPresent())
			throw new NotFoundException("id-" + id);
		return cabeceraHistorial.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody CabeceraHistorial newCabeceraHistorial) {
		Logger.info("Creating CabeceraHistorial : {}", newCabeceraHistorial);
		
		CabeceraHistorial cabeceraHistorial = cabeceraHistorialService.save(newCabeceraHistorial);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cabeceraHistorial.getIdCabeceraHistorial()).toUri();
		return ResponseEntity.created(location).build().ok().body(cabeceraHistorial);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody CabeceraHistorial cabeceraHistorial){
		
		Logger.info("Updating CabeceraHistorial with id {}", id);
		
		Optional<CabeceraHistorial> projectDetalleHistorial = cabeceraHistorialService.findBy(id);
		if (!projectDetalleHistorial.isPresent())
			return ResponseEntity.notFound().build();
		cabeceraHistorial.setIdCabeceraHistorial(id);
		cabeceraHistorialService.save(cabeceraHistorial);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting CabeceraHistorial with id {}", id);
		
		cabeceraHistorialService.delete(id);
	}
}

