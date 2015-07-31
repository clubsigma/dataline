package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

import javax.persistence.Entity;

import play.db.jpa.Model;


@Entity
public class Usuario extends Model {
	 public String Cedula;
	 public String nombre;
	 public String apellido;
	 public  String password;
	 public  String email;
    //
	public Usuario(String cedula, String nombre, String apellido, String password, String email) {
		super();
		this.Cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.email = email;
	}
	 
	 
}
