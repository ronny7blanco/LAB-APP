package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IPersonaDao;
import com.clinico.lab.models.entities.Personas;

@Service
public class PersonasServices implements IPersonasService {
	
	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Personas> findAll(){
		return personaDao.findAll();
	}
	
	@Override
	@Transactional()
	public Personas save(Personas persona) {
		return personaDao.save(persona);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Personas> findById(Long id){
		return personaDao.findById(id);
	}
	
	@Override
	@Transactional()
	public void delete(Long id) {
		personaDao.deleteById(id);
	}
}
