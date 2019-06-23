package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IDetalleHistorialDao;
import com.clinico.lab.models.entities.DetalleHistorial;
@Service
public class DetalleHistorialService implements IDetalleHistorialService{
	
	@Autowired
	private IDetalleHistorialDao detalleHistorialDao;

	@Override
	@Transactional(readOnly = true)
	public List<DetalleHistorial> findAll() {
		return detalleHistorialDao.findAll();
	}

	@Override
	@Transactional
	public DetalleHistorial save(DetalleHistorial detalleHistorial) {
		return detalleHistorialDao.save(detalleHistorial);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<DetalleHistorial> findById(Long id) {
		return detalleHistorialDao.findById(id);
	}

	@Override
	@Transactional()
	public void delete(Long id) {
		detalleHistorialDao.deleteById(id);
		}
}
