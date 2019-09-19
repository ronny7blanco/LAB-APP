package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IReferenciaDao;
import com.clinico.lab.models.entities.Referencias;

@Service
public class ReferenciasServices implements IReferenciasService{

	@Autowired
	private IReferenciaDao referenciaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Referencias> findAll() {
		// TODO Auto-generated method stub
		return referenciaDao.findAll();
	}

	@Override
	@Transactional()
	public Referencias save(Referencias referencias) {
		// TODO Auto-generated method stub
		return referenciaDao.save(referencias);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Referencias> findById(Long id) {
		// TODO Auto-generated method stub
		return referenciaDao.findById(id);
	}

	@Override
	@Transactional()
	public void delete(Long id) {
		// TODO Auto-generated method stub
		referenciaDao.deleteById(id);
	}
	
	
}
