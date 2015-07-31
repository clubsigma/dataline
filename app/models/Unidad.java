/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Unidad.java
 * DESCRIPCIÓN: Posee atributos y métodos correspondientes a las unidades académicas
 * de la Universidad.
 * FECHA DE CREACIÓN: 10jul015
 * AUTOR: eacurioUTC
 * 
 * MODIFICACIONES:
 * FECHA		AUTOR		LÍNEAMODIFICADA		DESCRIPCIÓN
 * 10jul015		eacurioUTC	1					Crea la clase
 * 23jul015		acevalloUTC	1-12				Fija formato de modificación
 * 
 * 			
 * */
package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Unidad extends Model {

    public String nombre;
    public long codigo;
    
    public Unidad(long codigo, String nombre){
    	this.codigo=codigo;
    	this.nombre = nombre;
    	
    }

}
