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

import com.clinico.lab.models.entities.DetalleTipoExamen;
import com.clinico.lab.models.services.IDetalleTipoExamenService;
import com.clinico.lab.models.utils.NotFoundException;

@RestController
@RequestMapping("/lab/detalle_tipoex")
public class DetalleTipoExamenController {

	public static final Logger Logger = LoggerFactory.getLogger(DetalleTipoExamenController.class);

	@Autowired
	private IDetalleTipoExamenService detalleTipoExamenService;
	
	@RequestMapping("")
	private List<DetalleTipoExamen> findAll(){
		return detalleTipoExamenService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public DetalleTipoExamen getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching CabeceraHistorial with id {}", id);

		Optional<DetalleTipoExamen> detalleTipoExamen = detalleTipoExamenService.findById(id);
		if (!detalleTipoExamen.isPresent())
			throw new NotFoundException("id-" + id);
		return detalleTipoExamen.get();
	}
	
	@SuppressWarnings("static-access")
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody DetalleTipoExamen newDetalleTipoExamen) {
		Logger.info("Creating DetalleTipoExamen : {}", newDetalleTipoExamen);
		
		DetalleTipoExamen detalleTipoExamen = detalleTipoExamenService.save(newDetalleTipoExamen);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(detalleTipoExamen.getIdDetalleTipoExamen()).toUri();
		return ResponseEntity.created(location).build().ok().body(detalleTipoExamen);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody DetalleTipoExamen detalleTipoExamen){
		
		Logger.info("Updating CabeceraHistorial with id {}", id);
		
		Optional<DetalleTipoExamen> projectDetalleHistorial = detalleTipoExamenService.findById(id);
		if (!projectDetalleHistorial.isPresent())
			return ResponseEntity.notFound().build();
		detalleTipoExamen.setIdDetalleTipoExamen(id);
		detalleTipoExamenService.save(detalleTipoExamen);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting DetalleTipoExamen with id {}", id);
		
		detalleTipoExamenService.delete(id);
	}
}
