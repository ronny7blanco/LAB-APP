package com.clinico.lab.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinico.lab.models.entities.HistorialExamen;

public interface IHistorialExamenDao extends JpaRepository<HistorialExamen, Long>{

}
