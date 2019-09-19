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
@Table(name="PERSONAS")
@Getter @Setter @NoArgsConstructor
public class Personas {
	
	@Id
	private Long idPersona;
	private String dui;
	private String nombre;
	private String apellido;
	private String genero;
	private Date  fechaNacimiento;
	private String eMail;
	private String telefonoCelular;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRol", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Roles idRol;
	
	private String usuarioCreo;
	private Date fechaCreo;
	private String usuarioModi;
	private Date fechaModi;

}

