package com.clinico.lab.models.entities;

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
@Table (name="ENCABEZADO_EXAMEN")
@Getter @Setter @NoArgsConstructor
public class EncabezadoExamen {

	@Id
	private Long idEncabezadoExamen;
	private String descripcion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUsuario", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Usuarios idUsuario;
}
