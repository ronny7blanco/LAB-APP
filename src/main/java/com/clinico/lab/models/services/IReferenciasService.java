package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.Referencias;

public interface IReferenciasService {
	
	public List<Referencias> findAll();
	
	public Referencias save(Referencias referencias);
	
	public Optional<Referencias> findById(Long id);
	
	public void delete(Long id);
}
