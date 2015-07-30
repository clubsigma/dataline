/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Publicacion.java
 * DESCRIPCIÓN: Posee atributos y métodos correspondientes al tema central del estudiante 
 * que ha realizado en el blog.
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
import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Publicacion extends Model{
    public String Contenido;
    public int calificacion;
    public Date fecha;
    public String titulo;

}
