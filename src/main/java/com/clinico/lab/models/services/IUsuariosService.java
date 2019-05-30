package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.Usuarios;

public interface IUsuariosService {

	public List<Usuarios> findAll();
	
	public Usuarios save(Usuarios usuarios);
	
	public Optional<Usuarios> findById(Long id);
	
	public void delete(Long id);
}
