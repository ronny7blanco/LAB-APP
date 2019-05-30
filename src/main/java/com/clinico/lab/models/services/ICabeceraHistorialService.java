package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.CabeceraHistorial;

public interface ICabeceraHistorialService {
	
	public List<CabeceraHistorial> findAll();
	
	public CabeceraHistorial save (CabeceraHistorial cabeceraHistorial);
	
	public Optional<CabeceraHistorial> findBy(Long id);
	
	public void delete(Long id);

}
