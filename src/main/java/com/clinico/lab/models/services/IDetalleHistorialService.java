package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.DetalleHistorial;

public interface IDetalleHistorialService {
	
	public List<DetalleHistorial> findAll();
	
	public DetalleHistorial save(DetalleHistorial detalleHistorial);
	
	public Optional<DetalleHistorial> findById (Long id);
	
	public void delete (Long id);

}
