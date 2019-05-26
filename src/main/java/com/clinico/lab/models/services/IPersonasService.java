package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.Personas;

public interface IPersonasService {

	public List<Personas> findAll();
	
	public Personas save(Personas personas);
	
	public Optional<Personas> findById(Long id);
	
	public void delete(Long id);
}
