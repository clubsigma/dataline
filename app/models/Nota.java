/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Nota.java
 * DESCRIPCIÓN: Posee atributos y métodos correspondientes a las calificaciones que posea
 * los estudiantes en sus asignaturas
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

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Nota extends Model {
    public float valor;

}
