package com.clinico.lab.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TIPOSEXAMENES")
@Getter @Setter @NoArgsConstructor
public class TipoExamen {

	@Id
	private Long idTipoExamen;
	private String nombreExamen;
	private String muestra;
	private String Descripcion;
}
