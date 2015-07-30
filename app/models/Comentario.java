/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Comentario.java
 * DESCRIPCIÓN: Posee atributos y métodos correspondientes a los post que los estudiantes 
 * de la Universidad realicen en un blog
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

import javax.persistence.Entity;
import play.db.jpa.Model;
@Entity
public class Comentario extends Model{
    public String contenido;
    public Date fecha;

}
