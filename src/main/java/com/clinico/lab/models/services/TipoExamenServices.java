package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.ITipoExamenDao;
import com.clinico.lab.models.entities.TipoExamen;


public class TipoExamenServices implements ITipoExamenService{
	
	@Autowired
	private ITipoExamenDao tipoExamenDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<TipoExamen> findAll(){
		return tipoExamenDao.findAll();
	}
	
	@Override
	@Transactional()
	public TipoExamen save(TipoExamen tipoExamen) {
		return tipoExamenDao.save(tipoExamen);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<TipoExamen> findById(Long id){
		return tipoExamenDao.findById(id);
	}
	
	@Override
	@Transactional()
	public void delete(Long id) {
		tipoExamenDao.deleteById(id);
	}
}
