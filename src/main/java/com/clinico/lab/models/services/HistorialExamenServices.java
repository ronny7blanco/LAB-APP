package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IHistorialExamenDao;
import com.clinico.lab.models.entities.HistorialExamen;

@Service
public class HistorialExamenServices implements IHistorialExamenService{
	
	@Autowired
	private IHistorialExamenDao historialDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<HistorialExamen> findAll() {
		// TODO Auto-generated method stub
		return historialDao.findAll();
	}

	@Override
	@Transactional()
	public HistorialExamen save(HistorialExamen historiales) {
		// TODO Auto-generated method stub
		return historialDao.save(historiales);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<HistorialExamen> findById(Long id) {
		// TODO Auto-generated method stub
		return historialDao.findById(id);
	}

	@Override
	@Transactional()
	public void delete(Long id) {
		// TODO Auto-generated method stub
		historialDao.deleteById(id);
	}

}
