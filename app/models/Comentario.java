package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Comentario extends Model {
	public String descripcion;
	public String autores;

	public Comentario(String descripcion, String autores ) {
		super();
		this.descripcion = descripcion;
		this.autores = autores;
	}


}
