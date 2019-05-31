package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.EncabezadoExamen;

public interface IEncabezadoExamenService {

public List<EncabezadoExamen> findAll();
	
	public EncabezadoExamen save(EncabezadoExamen encabezadoExamen);
	
	public Optional<EncabezadoExamen> findById(Long id);
	
	public void delete(Long id);
}
