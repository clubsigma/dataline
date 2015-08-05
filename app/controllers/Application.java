/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Application.java
 * DESCRIPCIÓN: Posee métodos correspondientes al controlador principal de la aplicación.
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

package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	Categoria cat= Categoria.find("SELECT c FROM Categoria c ORDER BY id DESC LIMIT 1").first();
		if (cat == null) {
			cat= inicializar();
		} 	
	
        render();
    }
    public static void distributivo() {
        render();
    }
    
    public static void creditos() {
        render();
    }
    
	private static Categoria inicializar() {
		Categoria cat;
			cat =new Categoria(1,"Programacion orientada a objeto ");
			cat.save();
			cat =new Categoria(2,"Estructura de datos ");
			cat.save();
			return cat;
		}
	public static void indexforo() {

		List<Categoria> cate=Categoria.findAll();
		render(cate);
		
	}
	public static void contacto() {

		render();
	}
	
	public static void distributivoInicial() {

		render();
	}
	public static void actividadDocencia() {

		render();
	}
	public static void otrasActividades() {

		render();
	}
	public static void publicaciones() {

		List<Publicacion> publi=Publicacion.findAll();
		render(publi);
	}
	
	public static void Comentario(long id) {
	Publicacion p=Publicacion.findById(id);
	render(p);
		redirect("/application/Comentario");
	
	
	}
	public static void ver  (long id) {
		Comentario co=Comentario.findById(id);
		render(co);
			redirect("/application/Comentario");
		
		
		}
		

	
	
	public static void nuevoTema() {
		render();
	
	}
	public static void guardar(String tema, String descripcion, String fecha)
	{
	Publicacion pub=new  Publicacion( tema, descripcion, fecha);		
	pub.save();
	redirect("/application/publicaciones");

	}
	
	public static void guardarComentario(String descripcion)
	{
	Comentario c=new  Comentario(descripcion);		
	c.save();
	redirect("/application/publicaciones");
	
	}

    
    
    
    
};
