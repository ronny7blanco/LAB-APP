
package com.clinico.lab.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Usuarios")
@Getter @Setter @NoArgsConstructor
public class Usuarios {
	
	@Id 
	private Long idUsuario;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String role;
}
