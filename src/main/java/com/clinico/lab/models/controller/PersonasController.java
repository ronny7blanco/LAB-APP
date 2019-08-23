package com.clinico.lab.models.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.clinico.lab.models.entities.Personas;
import com.clinico.lab.models.services.IPersonasService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/personas")
public class PersonasController {
	
	public static final Logger logger = LoggerFactory.getLogger(PersonasController.class);
	
	@Autowired
	private IPersonasService personaService;
	
	@RequestMapping("")
	private List<Personas> findAll(){
		return personaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Personas getOne( @PathVariable ("id") long id) {
		logger.debug("Fetching Persona with id {}", id);
		
		Optional<Personas> personas = personaService.findById(id);
		if (!personas.isPresent())
			throw new NotFoundException("id-" + id);
		return personas.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create(@RequestBody Personas newPersonas) {
		logger.info("Creating Persona : {}", newPersonas);
		
		Personas personas = personaService.save(newPersonas);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(personas.getIdPersona()).toUri();
		return ResponseEntity.created(location).build().ok().body(personas);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Personas personas) {
        
		logger.info("Updating Personas with id {}", id);
		
		Optional<Personas> projectOptional = personaService.findById(id);
		if (!projectOptional.isPresent())
			return ResponseEntity.notFound().build();
		personas.setIdPersona(id);
		personaService.save(personas);
		return ResponseEntity.noContent().build();
    }
	 
	@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        
		logger.info("Fetching & Deleting Personas with id {}", id);
        
		personaService.delete(id);        
    }
}
