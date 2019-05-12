package com.clinico.lab.models.entities;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ExamenesRealizados")
@Getter @Setter @NoArgsConstructor
public class ExamenesRealizados {

@Id
private Long isExamenesRealizados;
private Long idPaciente;
private Long idTipoExamen;
private Date fecha;
private String precio;
private String encabezado_Examen_idEncabezado_Examen;


}
