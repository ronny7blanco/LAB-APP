package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IRolesDao;
import com.clinico.lab.models.entities.Roles;

@Service
public class RolesServices implements IRolesService{
	
	@Autowired
	private IRolesDao rolesDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Roles> findAll() {
		// TODO Auto-generated method stub
		return rolesDao.findAll();
	}

	@Override
	@Transactional()
	public Roles save(Roles roles) {
		// TODO Auto-generated method stub
		return rolesDao.save(roles);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Roles> findById(Long id) {
		// TODO Auto-generated method stub
		return rolesDao.findById(id);
	}

	@Override
	@Transactional()
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolesDao.deleteById(id);
	}

}
