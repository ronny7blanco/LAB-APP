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
@Table(name="EXAMENES REALIZADOS")
@Getter @Setter @NoArgsConstructor
public class ExamenesRealizados {

@Id

	private Long idExamenRealizado;
	private Date fecha;
	private String precio;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPersona", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Personas idPersona;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTipoExamen", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private TipoExamen idTipoExamen;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idEncabezadoExamen", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private EncabezadoExamen idEncabezadoExamen;
	


}
