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

import com.clinico.lab.models.entities.HistorialExamen;
import com.clinico.lab.models.services.IHistorialExamenService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/historial")
public class HistorialExamenController {
	
	public static final Logger logger = LoggerFactory.getLogger(HistorialExamenController.class);
	
	@Autowired
	private IHistorialExamenService historialService;
	
	@RequestMapping("")
	private List<HistorialExamen> findAll(){
		return historialService.findAll();
	}
	
	@GetMapping("/{id}")
	public HistorialExamen getOne( @PathVariable ("id") long id) {
		logger.debug("Fetching Historial with id {}", id);
		
		Optional<HistorialExamen> historiales = historialService.findById(id);
		if (!historiales.isPresent())
			throw new NotFoundException("id-" + id);
		return historiales.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create(@RequestBody HistorialExamen newHistoriales) {
		logger.info("Creating Historial : {}", newHistoriales);
		
		HistorialExamen historiales = historialService.save(newHistoriales);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(historiales.getIdHistorial()).toUri();
		return ResponseEntity.created(location).build().ok().body(historiales);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody HistorialExamen historiales) {
        
		logger.info("Updating Historial with id {}", id);
		
		Optional<HistorialExamen> projectOptional = historialService.findById(id);
		if (!projectOptional.isPresent())
			return ResponseEntity.notFound().build();
		historiales.setIdHistorial(id);
		historialService.save(historiales);
		return ResponseEntity.noContent().build();
    }
	 
	@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        
		logger.info("Fetching & Deleting Historial with id {}", id);
        
		historialService.delete(id);        
    }
}
