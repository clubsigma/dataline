/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Asignatura.java
 * DESCRIPCIÓN: Posee atributos y métodos correspondientes asignatura que se imparten
 * en la Universidad Técnica de Cotopaxi
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
public class Asignatura extends Model{
    public String nombre;
    public int creditos;

}
