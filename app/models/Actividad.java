/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Actividad.java
 * DESCRIPCIÓN: Posee atributos y métodos correspondientes a las actividades de trabajo
 * que tiene el docente en la Universidad.
 * FECHA DE CREACIÓN: 10jul015
 * AUTOR: eacurioUTC
 * 
 * MODIFICACIONES:
 * FECHA		AUTOR		LÍNEAMODIFICADA		DESCRIPCIÓN
 * 10jul015		eacurioUTC	1					Crea la clase
 * 23jul015		acevalloUTC	1-15				Fija formato de modificación
 * 
 * 			
 * */

package models;

import java.util.Date;

public class Actividad {
    public String descripcion;
    public String hora;
    public Date fecha;
	public Actividad(String descripcion, String hora, Date fecha) {
		super();
		this.descripcion = descripcion;
		this.hora = hora;
		this.fecha = fecha;
	}
    
}
