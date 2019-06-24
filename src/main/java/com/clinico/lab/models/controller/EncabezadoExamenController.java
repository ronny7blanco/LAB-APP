package com.clinico.lab.models.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

import com.clinico.lab.models.entities.EncabezadoExamen;
import com.clinico.lab.models.services.IEncabezadoExamenService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/enca_ex")
public class EncabezadoExamenController {

	public static final Logger Logger = LoggerFactory.getLogger(EncabezadoExamenController.class);

	@Autowired
	private IEncabezadoExamenService encabezadoExamenService;
	
	@RequestMapping("")
	private List<EncabezadoExamen> findAll(){
		return encabezadoExamenService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public EncabezadoExamen getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching EncabezadoExamen with id {}", id);

		Optional<EncabezadoExamen> encabezadoExamen = encabezadoExamenService.findById(id);
		if (!encabezadoExamen.isPresent())
			throw new NotFoundException("id-" + id);
		return encabezadoExamen.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody EncabezadoExamen newEncabezadoExamen) {
		Logger.info("Creating CabeceraHistorial : {}", newEncabezadoExamen);
		
		EncabezadoExamen encabezadoExamen = encabezadoExamenService.save(newEncabezadoExamen);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(encabezadoExamen.getIdEncabezadoExamen()).toUri();
		return ResponseEntity.created(location).build().ok().body(encabezadoExamen);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody EncabezadoExamen encabezadoExamen){
		
		Logger.info("Updating CabeceraHistorial with id {}", id);
		
		Optional<EncabezadoExamen> projectDetalleHistorial = encabezadoExamenService.findById(id);
		if (!projectDetalleHistorial.isPresent())
			return ResponseEntity.notFound().build();
		encabezadoExamen.setIdEncabezadoExamen(id);
		encabezadoExamenService.save(encabezadoExamen);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting EncabezadoExamen with id {}", id);
		
		encabezadoExamenService.delete(id);
	}
}
