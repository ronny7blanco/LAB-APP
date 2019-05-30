package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IExamenesRealizadosDao;
import com.clinico.lab.models.entities.ExamenesRealizados;

public class ExamenesRealizadosService implements IExamenesRealizadosService {
	
	@Autowired
	private IExamenesRealizadosDao examenesRealizadosDao;

	@Override
	@Transactional(readOnly = true)
	public List<ExamenesRealizados> findAll() {
		return examenesRealizadosDao.findAll();
	}

	@Override
	@Transactional
	public ExamenesRealizados save(ExamenesRealizados examenesRealizados) {
		return examenesRealizadosDao.save(examenesRealizados);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<ExamenesRealizados> findById(Long id) {
		return examenesRealizadosDao.findById(id);
	}
	
	@Override
	@Transactional()
	public void delete(Long id) {
		examenesRealizadosDao.deleteById(id);
	}
}
