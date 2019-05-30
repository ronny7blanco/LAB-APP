package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.clinico.lab.models.dao.IUsuariosDao;
import com.clinico.lab.models.entities.Usuarios;

public class UsuariosServices implements IUsuariosService {
	
	@Autowired
	private IUsuariosDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuarios> findAll(){
		return usuarioDao.findAll();
	}
	
	@Override
	@Transactional()
	public Usuarios save(Usuarios usuarios) {
		return usuarioDao.save(usuarios);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Usuarios> findById(Long id){
		return usuarioDao.findById(id);
	}
	
	@Override
	@Transactional()
	public void delete(Long id) {
		usuarioDao.deleteById(id);
	}
}
