package com.clinico.lab.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinico.lab.models.entities.DetalleHistorial;


public interface IDetalleHistorialDao extends JpaRepository<DetalleHistorial , Long>{

}
