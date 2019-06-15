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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.clinico.lab.models.entities.CabeceraHistorial;
import com.clinico.lab.models.entities.ExamenesRealizados;
import com.clinico.lab.models.services.ExamenesRealizadosService;
import com.clinico.lab.models.services.ICabeceraHistorialService;
import com.clinico.lab.models.services.IExamenesRealizadosService;
import com.clinico.lab.models.utils.NotFoundException;

public class ExamenesRealizadosController {
	
	public static final Logger Logger = LoggerFactory.getLogger(ExamenesRealizadosController.class);

	@Autowired
	private IExamenesRealizadosService examenesRealizadosService;
	
	@RequestMapping("")
	private List<ExamenesRealizados> findAll(){
		return examenesRealizadosService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public ExamenesRealizados getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching ExamenesRealizados with id {}", id);

		Optional<ExamenesRealizados> examenesRealizados = examenesRealizadosService.findById(id);
		if (!examenesRealizados.isPresent())
			throw new NotFoundException("id-" + id);
		return examenesRealizados.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody ExamenesRealizados newExamenesRealizados) {
		Logger.info("Creating ExamenesRealizados : {}", newExamenesRealizados);
		
		ExamenesRealizados examenesRealizados = examenesRealizadosService.save(newExamenesRealizados);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(examenesRealizados.getIdExamenRealizado()).toUri();
		return ResponseEntity.created(location).build().ok().body(examenesRealizados);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody ExamenesRealizados examanesRealizados){
		
		Logger.info("Updating Project with id {}", id);
		
		Optional<ExamenesRealizados> projectExamenesRealizados = examenesRealizadosService.findBy(id);
		if (!projectExamenesRealizados.isPresent())
			return ResponseEntity.notFound().build();
		examanesRealizados.setIdCabeceraHistorial(id);
		examenesRealizadosService.save(examanesRealizados);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting Project with id {}", id);
		
		examenesRealizadosService.delete(id);
	}

}
