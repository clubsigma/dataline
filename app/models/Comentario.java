package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Comentario extends Model {
	public String descripcion;

	public Comentario(String descripcion) {
		super();
		this.descripcion = descripcion;
	}


}
