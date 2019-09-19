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

import com.clinico.lab.models.entities.Referencias;
import com.clinico.lab.models.services.IReferenciasService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/referencias")
public class ReferenciasController {
	
	public static final Logger logger = LoggerFactory.getLogger(ReferenciasController.class);
	
	@Autowired
	private IReferenciasService referenciaService;
	
	@RequestMapping("")
	private List<Referencias> findAll(){
		return referenciaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Referencias getOne( @PathVariable ("id") long id) {
		logger.debug("Fetching Referencia with id {}", id);
		
		Optional<Referencias> referencias = referenciaService.findById(id);
		if (!referencias.isPresent())
			throw new NotFoundException("id-" + id);
		return referencias.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create(@RequestBody Referencias newReferencias) {
		logger.info("Creating Referencia : {}", newReferencias);
		
		Referencias referencias = referenciaService.save(newReferencias);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(referencias.getIdReferencia()).toUri();
		return ResponseEntity.created(location).build().ok().body(referencias);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Referencias referencias) {
        
		logger.info("Updating Referencia with id {}", id);
		
		Optional<Referencias> projectOptional = referenciaService.findById(id);
		if (!projectOptional.isPresent())
			return ResponseEntity.notFound().build();
		referencias.setIdReferencia(id);
		referenciaService.save(referencias);
		return ResponseEntity.noContent().build();
    }
	 
	@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        
		logger.info("Fetching & Deleting Referencia with id {}", id);
        
		referenciaService.delete(id);        
    }

}
