package com.clinico.lab.models.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="DetalleExpediente")
@Getter @Setter @NoArgsConstructor
public class DetalleExpediente {
	
	private long IdDetalleExpediente;
	
	private long IdCabeceraExpediente;
	
	private Date FechaRealizado;
	
	private long IdEmpleado;

}
