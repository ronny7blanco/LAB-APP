package com.clinico.lab.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinico.lab.models.entities.DetalleExamenRealizado;


public interface IDetalleExamenRealizadoDao extends JpaRepository<DetalleExamenRealizado , Long>{

}
