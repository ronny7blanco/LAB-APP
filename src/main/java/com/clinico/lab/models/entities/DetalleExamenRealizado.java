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
@Table(name="DETALLE EXAMEN REALIZADO")
@Getter @Setter @NoArgsConstructor
public class DetalleExamenRealizado {

	@Id
	private Long idDetalleExamenRealizado;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idExamenRealizado", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private ExamenesRealizados idExamenRealizado;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDetalleTipoExamen", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private DetalleTipoExamen idDetalleTipoExamen;

}
