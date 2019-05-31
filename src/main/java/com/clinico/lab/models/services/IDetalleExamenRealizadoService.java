package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.DetalleExamenRealizado;

public interface IDetalleExamenRealizadoService {

public List<DetalleExamenRealizado> findAll();
	
	public DetalleExamenRealizado save(DetalleExamenRealizado detalleExamenRealizado);
	
	public Optional<DetalleExamenRealizado> findById(Long id);
	
	public void delete(Long id);
}
