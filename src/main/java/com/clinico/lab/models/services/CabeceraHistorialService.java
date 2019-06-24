package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.ICabeceraHistorialDao;
import com.clinico.lab.models.entities.CabeceraHistorial;
@Service
public class CabeceraHistorialService implements ICabeceraHistorialService {
	
	@Autowired
	private ICabeceraHistorialDao cabeceraHistorialDao;

	@Override
	@Transactional(readOnly = true)
	public List<CabeceraHistorial> findAll() {
		return cabeceraHistorialDao.findAll();
	}

	@Override
	@Transactional
	public CabeceraHistorial save(CabeceraHistorial cabeceraHistorial) {
		return cabeceraHistorialDao.save(cabeceraHistorial);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<CabeceraHistorial> findById(Long id) {
		return cabeceraHistorialDao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		cabeceraHistorialDao.deleteById(id);
		
	}

}
