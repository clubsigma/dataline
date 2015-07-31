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
    private long codigo;

    @OneToMany(cascade = CascadeType.ALL)
   	@MapKey(name = "codigo")
   	public Map<Long, Unidad> unidad;
    
    public Carrera() {
		this.unidad = new HashMap<Long, Unidad>();
	}
    
    
    public void addUnidad(long codigo, String nombre) {
		Unidad unidad = new Unidad(codigo, nombre);

		this.unidad.put(codigo, unidad);		
	}
}
