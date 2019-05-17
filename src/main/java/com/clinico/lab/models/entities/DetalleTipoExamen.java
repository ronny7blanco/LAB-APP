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
@Table (name="DETALLE_TIPO_EXAMEN")
@Getter @Setter @NoArgsConstructor
public class DetalleTipoExamen {

	@Id
	
	
	private Long idDetalleTipoExamen;
	private String campoExamen;
	private Long requiereValorNormal;
	private String valorNormal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTipoExamen", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private TipoExamen idTipoExamen;
}
