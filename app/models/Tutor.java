package models;

import play.db.jpa.Model;

public class Tutor extends Model {
	
	public String cedula;
	public String nombre;
	public String apellido;
	public String password;
	
	public Tutor (String cedula, String nombre, String apellido, String password ){
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
	}
	
	

}
