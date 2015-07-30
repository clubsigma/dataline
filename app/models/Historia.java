package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Historia extends Model {
	
	public String nombre;
	
	public int numero;
	
	public String usuario;
	
	public int prioridad;
	
	public String descripcion;
	
	public boolean validacion;

	public Historia(String nombre, int numero, String usuario, int prioridad,
			String descripcion, boolean validacion) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.usuario = usuario;
		this.prioridad = prioridad;
		this.descripcion = descripcion;
		this.validacion = validacion;
	}

	
    
}
