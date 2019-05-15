
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
<<<<<<< HEAD
	private Long idUsuario;
	private String tipoEmpleado;
	private String nombreUsuario;
	private String contraseña;
	private String estado;
=======
	private Long Id_Usuarios;
	private String Nombre_de_Usuario;
	private String Contraseña;
	private String estado;
	
>>>>>>> 15e6fedd8f40ef426e0c708c709d488633dd6986

}
