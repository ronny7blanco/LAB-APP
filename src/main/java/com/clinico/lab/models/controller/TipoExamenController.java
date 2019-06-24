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

import com.clinico.lab.models.entities.TipoExamen;
import com.clinico.lab.models.services.ITipoExamenService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/tipo_examen")
public class TipoExamenController {
	
	public static final Logger logger = LoggerFactory.getLogger(TipoExamenController.class);
	
	@Autowired
	private ITipoExamenService tipoexamenService;
	
	@RequestMapping("")
	private List<TipoExamen> findAll(){
		return tipoexamenService.findAll();
	}
	
	@GetMapping("/{id}")
	public TipoExamen getOne( @PathVariable ("id") long id) {
		logger.debug("Fetching TipoExamen with id {}", id);
		
		Optional<TipoExamen> tipoexamen = tipoexamenService.findById(id);
		if (!tipoexamen.isPresent())
			throw new NotFoundException("id-" + id);
		return tipoexamen.get();
	}
	
	@SuppressWarnings("static-access")
	@PostMapping("")
	public ResponseEntity<Object> create(@RequestBody TipoExamen newTipoExamen) {
		logger.info("Creating TipoExamen : {}", newTipoExamen);
		
		TipoExamen tipoexamen = tipoexamenService.save(newTipoExamen);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(tipoexamen.getIdTipoExamen()).toUri();
		return ResponseEntity.created(location).build().ok().body(tipoexamen);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody TipoExamen tipoexamen) {
        
		logger.info("Updating TipoExamen with id {}", id);
		
		Optional<TipoExamen> projectOptional = tipoexamenService.findById(id);
		if (!projectOptional.isPresent())
			return ResponseEntity.notFound().build();
		tipoexamen.setIdTipoExamen(id);
		tipoexamenService.save(tipoexamen);
		return ResponseEntity.noContent().build();
    }
	 
	@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        
		logger.info("Fetching & Deleting TipoExamen with id {}", id);
        
		tipoexamenService.delete(id);        
    }

}
