package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.TipoExamen;

public interface ITipoExamenService {
	
	public List<TipoExamen> findAll();
	
	public TipoExamen save(TipoExamen tipoExamen);
	
	public Optional<TipoExamen> findById(Long id);
	
	public void delete(Long id);
}
