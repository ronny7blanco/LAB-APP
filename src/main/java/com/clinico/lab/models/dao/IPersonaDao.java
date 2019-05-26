package com.clinico.lab.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinico.lab.models.entities.Personas;

public interface IPersonaDao extends JpaRepository<Personas , Long>{

	
}
