package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.ExamenesRealizados;

public interface IExamenesRealizadosService {

	public List<ExamenesRealizados> findAll();
	
	public ExamenesRealizados save(ExamenesRealizados examenesRealizados);
	
	public Optional<ExamenesRealizados> findById(Long id);
	
	public void delete(Long id);
}
