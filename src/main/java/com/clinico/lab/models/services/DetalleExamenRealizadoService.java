package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IDetalleExamenRealizadoDao;
import com.clinico.lab.models.entities.DetalleExamenRealizado;

public class DetalleExamenRealizadoService implements IDetalleExamenRealizadoService {

	@Autowired
	private IDetalleExamenRealizadoDao detalleExamenRealizadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<DetalleExamenRealizado> findAll(){
		return detalleExamenRealizadoDao.findAll();
	}
	
	@Override
	@Transactional()
	public DetalleExamenRealizado save(DetalleExamenRealizado detalleExamenRealizado) {
		return detalleExamenRealizadoDao.save(detalleExamenRealizado);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<DetalleExamenRealizado> findById(Long id){
		return detalleExamenRealizadoDao.findById(id);
	}
	
	@Override
	@Transactional()
	public void delete(Long id) {
		detalleExamenRealizadoDao.deleteById(id);
	}
}

