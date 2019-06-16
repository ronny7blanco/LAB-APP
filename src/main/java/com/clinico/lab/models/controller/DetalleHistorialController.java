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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.clinico.lab.models.entities.DetalleHistorial;
import com.clinico.lab.models.services.IDetalleHistorialService;
import com.clinico.lab.models.utils.NotFoundException;

public class DetalleHistorialController {

	public static final Logger Logger = LoggerFactory.getLogger(DetalleHistorialController.class);

	@Autowired
	private IDetalleHistorialService detalleHistorialService;
	
	@RequestMapping("")
	private List<DetalleHistorial> findAll(){
		return detalleHistorialService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public DetalleHistorial getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching DetalleHistorial with id {}", id);

		Optional<DetalleHistorial> detalleHistorial = detalleHistorialService.findById(id);
		if (!detalleHistorial.isPresent())
			throw new NotFoundException("id-" + id);
		return detalleHistorial.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody DetalleHistorial newDetalleHistorial) {
		Logger.info("Creating DetalleHistorial : {}", newDetalleHistorial);
		
		DetalleHistorial detalleHistorial = detalleHistorialService.save(newDetalleHistorial);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(detalleHistorial.getId()).toUri();
		return ResponseEntity.created(location).build().ok().body(detalleHistorial);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody DetalleHistorial detalleHistorial){
		
		Logger.info("Updating DetalleHistorial with id {}", id);
		
		Optional<DetalleHistorial> projectDetalleHistorial = detalleHistorialService.findById(id);
		if (!projectDetalleHistorial.isPresent())
			return ResponseEntity.notFound().build();
		detalleHistorial.setId(id);
		detalleHistorialService.save(detalleHistorial);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting DetalleHistorial with id {}", id);
		
		detalleHistorialService.delete(id);
	}
}


