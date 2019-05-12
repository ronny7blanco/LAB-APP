package com.clinico.lab.models.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="DETALLE EXAMEN REALIZADO")
@Getter @Setter @NoArgsConstructor
public class DetalleExamenRealizado {

	@Id
	private Long id;
	private Long idExamenRealizado;
	private Long idDetalleTipoExamen;
}
