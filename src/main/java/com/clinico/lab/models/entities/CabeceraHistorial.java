package com.clinico.lab.models.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CABECERA_HISTORIAL")
@Getter @Setter @NoArgsConstructor
public class CabeceraHistorial {
	
	@Id
	private Long idCabeceraHistorial;
	private Date fechaApertura;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPersona", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Personas idPersona;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUsuario", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Usuarios idUsuario;
}
