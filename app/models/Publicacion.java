package models;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Publicacion extends Model {

public String tema;
public String descripcion;
public String fecha;


public Publicacion( String tema, String descripcion, String fecha) {
	super();

	this.tema = tema;
	this.descripcion = descripcion;
	this.fecha=fecha;
  
}	
}
