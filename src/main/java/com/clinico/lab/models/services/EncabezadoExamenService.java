package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IEncabezadoExamenDao;
import com.clinico.lab.models.entities.EncabezadoExamen;
@Service
public class EncabezadoExamenService implements IEncabezadoExamenService {

	@Autowired
	private IEncabezadoExamenDao encabezadoExamenDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<EncabezadoExamen> findAll(){
		return encabezadoExamenDao.findAll();
	}
	
	@Override
	@Transactional()
	public EncabezadoExamen save(EncabezadoExamen encabezadoExamen) {
		return encabezadoExamenDao.save(encabezadoExamen);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<EncabezadoExamen> findById(Long id){
		return encabezadoExamenDao.findById(id);
	}
	
	@Override
	@Transactional()
	public void delete(Long id) {
		encabezadoExamenDao.deleteById(id);
	}
}
