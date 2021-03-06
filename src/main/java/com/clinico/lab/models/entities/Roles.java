package com.clinico.lab.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ROLES")
@Getter @Setter @NoArgsConstructor
public class Roles {
	
	@Id
	private Long idRol;
	private String nombre;
	
}
