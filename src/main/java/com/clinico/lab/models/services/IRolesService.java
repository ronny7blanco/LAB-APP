package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.Roles;

public interface IRolesService {
	
public List<Roles> findAll();
	
	public Roles save(Roles roles);
	
	public Optional<Roles> findById(Long id);
	
	public void delete(Long id);
}
