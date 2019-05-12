
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
	private Long Id_Usuarios;
	private String Nombre_de_Usuario;
	private String Contraseña;
	

}
