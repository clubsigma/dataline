package models;

import java.util.Date;

public class Actividad {
    public String descripcion;
    public String hora;
    public Date fecha;
	public Actividad(String descripcion, String hora, Date fecha) {
		super();
		this.descripcion = descripcion;
		this.hora = hora;
		this.fecha = fecha;
	}
    
}
