package com.clinico.lab.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Encabizado_Examen")
@Getter @Setter @NoArgsConstructor
public class Encabezado_Examen {

@Id
	private Long IdEncabezado_Examen;
	private String descripcion;
}
