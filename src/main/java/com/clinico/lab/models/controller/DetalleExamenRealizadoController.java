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

import com.clinico.lab.models.entities.DetalleExamenRealizado;
import com.clinico.lab.models.services.IDetalleExamenRealizadoService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/detalle_exre")
public class DetalleExamenRealizadoController {

	public static final Logger Logger = LoggerFactory.getLogger(DetalleExamenRealizadoController.class);

	@Autowired
	private IDetalleExamenRealizadoService detalleExamenRealizadoService;
	
	@RequestMapping("")
	private List<DetalleExamenRealizado> findAll(){
		return detalleExamenRealizadoService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public DetalleExamenRealizado getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching DetalleExamenRealizado with id {}", id);

		Optional<DetalleExamenRealizado> detalleExamenRealizado = detalleExamenRealizadoService.findById(id);
		if (!detalleExamenRealizado.isPresent())
			throw new NotFoundException("id-" + id);
		return detalleExamenRealizado.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody DetalleExamenRealizado newDetalleExamenRealizado) {
		Logger.info("Creating CabeceraHistorial : {}", newDetalleExamenRealizado);
		
		DetalleExamenRealizado detalleExamenRealizado = detalleExamenRealizadoService.save(newDetalleExamenRealizado);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(detalleExamenRealizado.getIdDetalleExamenRealizado()).toUri();
		return ResponseEntity.created(location).build().ok().body(detalleExamenRealizado);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody DetalleExamenRealizado detalleExamenRealizado){
		
		Logger.info("Updating DetalleExamenRealizado with id {}", id);
		
		Optional<DetalleExamenRealizado> projectDetalleHistorial = detalleExamenRealizadoService.findById(id);
		if (!projectDetalleHistorial.isPresent())
			return ResponseEntity.notFound().build();
		detalleExamenRealizado.setIdDetalleExamenRealizado(id);
		detalleExamenRealizadoService.save(detalleExamenRealizado);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting DetalleExamenRealizado with id {}", id);
		
		detalleExamenRealizadoService.delete(id);
	}
}
