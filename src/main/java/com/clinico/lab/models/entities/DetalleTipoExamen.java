package com.clinico.lab.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name="DETALLE TIPO EXAMEN")
@Getter @Setter @NoArgsConstructor
public class DetalleTipoExamen {

	@Id
	private Long id;
	private String campoExamen;
	private int requiereValorNormal;
	private String valorNormal;
	private Long idTipoExamen;
}
