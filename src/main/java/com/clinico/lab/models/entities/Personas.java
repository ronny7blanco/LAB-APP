package com.clinico.lab.models.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PERSONAS")
@Getter @Setter @NoArgsConstructor
public class Personas {

	@Id
	private Long id;
	private String nombre;
	private String apellido;
	private Date  fechaNacimiento;
	private String eMail;
	private String telefonoCelular;
	private String tipos;
	private String estado;
	private String roles;
	
}
