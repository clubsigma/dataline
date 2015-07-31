/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Carrera.java
 * DESCRIPCIÓN: Posee atributos y métodos correspondientes a las facultades de la 
 * Universidad,
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

import java.util.HashMap;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;
@Entity
public class Carrera extends Model {
    public String nombre;

   
}
