package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.HistorialExamen;;

public interface IHistorialExamenService {
public List<HistorialExamen> findAll();
	
	public HistorialExamen save(HistorialExamen historiales);
	
	public Optional<HistorialExamen> findById(Long id);
	
	public void delete(Long id);
}
