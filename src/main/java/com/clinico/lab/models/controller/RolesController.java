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

import com.clinico.lab.models.entities.Roles;
import com.clinico.lab.models.services.IRolesService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/roles")
public class RolesController {
	
public static final Logger logger = LoggerFactory.getLogger(RolesController.class);
	
	@Autowired
	private IRolesService rolesService;
	
	@RequestMapping("")
	private List<Roles> findAll(){
		return rolesService.findAll();
	}
	
	@GetMapping("/{id}")
	public Roles getOne( @PathVariable ("id") long id) {
		logger.debug("Fetching Rol with id {}", id);
		
		Optional<Roles> roles = rolesService.findById(id);
		if (!roles.isPresent())
			throw new NotFoundException("id-" + id);
		return roles.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create(@RequestBody Roles newRoles) {
		logger.info("Creating Roles : {}", newRoles);
		
		Roles roles = rolesService.save(newRoles);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(roles.getIdRol()).toUri();
		return ResponseEntity.created(location).build().ok().body(roles);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Roles roles) {
        
		logger.info("Updating Roles with id {}", id);
		
		Optional<Roles> projectOptional = rolesService.findById(id);
		if (!projectOptional.isPresent())
			return ResponseEntity.notFound().build();
		roles.setIdRol(id);
		rolesService.save(roles);
		return ResponseEntity.noContent().build();
    }
	 
	@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        
		logger.info("Fetching & Deleting Referencia with id {}", id);
        
		rolesService.delete(id);        
    }

}
