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

import com.clinico.lab.models.entities.Usuarios;
import com.clinico.lab.models.services.IUsuariosService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/usuarios")
public class UsuariosController {
	
	public static final Logger logger = LoggerFactory.getLogger(UsuariosController.class);
	
	@Autowired
	private IUsuariosService usuariosService;
	
	@RequestMapping("")
	private List<Usuarios> findAll(){
		return usuariosService.findAll();
	}
	
	@GetMapping("/{id}")
	public Usuarios getOne( @PathVariable ("id") long id) {
		logger.debug("Fetching Usuarios with id {}", id);
		
		Optional<Usuarios> usuarios = usuariosService.findById(id);
		if (!usuarios.isPresent())
			throw new NotFoundException("id-" + id);
		return usuarios.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create(@RequestBody Usuarios newUsuarios) {
		logger.info("Creating Usuario : {}", newUsuarios);
		
		Usuarios usuarios = usuariosService.save(newUsuarios);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuarios.getIdUsuario()).toUri();
		return ResponseEntity.created(location).build().ok().body(usuarios);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Usuarios usuarios) {
        
		logger.info("Updating Usuarios with id {}", id);
		
		Optional<Usuarios> projectOptional = usuariosService.findById(id);
		if (!projectOptional.isPresent())
			return ResponseEntity.notFound().build();
		usuarios.setIdUsuario(id);
		usuariosService.save(usuarios);
		return ResponseEntity.noContent().build();
    }
	 
	@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        
		logger.info("Fetching & Deleting Usuarios with id {}", id);
        
		usuariosService.delete(id);        
    }
}
