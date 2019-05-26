package com.clinico.lab.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinico.lab.models.entities.TipoExamen;

public interface ITipoExamenDao extends JpaRepository<TipoExamen, Long>{

}
