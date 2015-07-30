/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Matricula.java
 * DESCRIPCIÓN: Posee atributos y métodos correspondientes a la matriculación del 
 * alumno en cada semestre
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

import java.util.Date;
@Entity
public class Matricula extends Model{
    public Date fecha;

}
