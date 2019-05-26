package com.clinico.lab.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinico.lab.models.entities.Usuarios;

public interface IUsuariosDao extends JpaRepository<Usuarios , Long>{

}
