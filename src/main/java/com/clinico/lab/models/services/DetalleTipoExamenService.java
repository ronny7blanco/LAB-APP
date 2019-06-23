package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IDetalleTipoExamenDao;
import com.clinico.lab.models.entities.DetalleTipoExamen;
@Service
public class DetalleTipoExamenService implements IDetalleTipoExamenService {

	@Autowired
	private IDetalleTipoExamenDao detalleTipoExamenDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<DetalleTipoExamen> findAll(){
		return detalleTipoExamenDao.findAll();
	}
	
	@Override
	@Transactional()
	public DetalleTipoExamen save(DetalleTipoExamen detalleTipoExamen) {
		return detalleTipoExamenDao.save(detalleTipoExamen);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<DetalleTipoExamen> findById(Long id){
		return detalleTipoExamenDao.findById(id);
	}
	
	@Override
	@Transactional()
	public void delete(Long id) {
		detalleTipoExamenDao.deleteById(id);
	}
}
