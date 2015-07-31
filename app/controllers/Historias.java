package controllers;

import java.util.List;

import models.Equipo;
import models.Historia;
import models.Proyecto;
import models.Usuario;
import play.mvc.Before;
import play.mvc.Controller;

public class Historias extends Controller {
	
	@Before
	public static void mostrarUsuario(){

			Usuario user = Usuario.find("byEmail", Security.connected()).first();
			if(Security.isConnected()) {
		        renderArgs.put("usuarioConectado", user); 
		    }


	}

    public static void index() {
    	Usuario productOwner = Usuario.find("byEmail", Security.connected()).first();
    	
    	List<Equipo> equipos=Equipo.find("byProductOwner", productOwner).fetch();
        render(equipos);
    }
    
    
    public static void gestionarHistorias(Long id_proyecto){
    	Proyecto proyecto=Proyecto.findById(id_proyecto);    	
    	render(proyecto);
    }
    
    public static void guardarHistoria(Long id_proyecto,String nombre, int numero, String usuario, int prioridad, String descripcion){
    	Proyecto proyecto=Proyecto.findById(id_proyecto);
    	Historia historia=new Historia(nombre, numero, usuario, prioridad, descripcion, false);
    	historia.save();
    	proyecto.historias.add(historia);
    	proyecto.save();
    	flash.put("confirmacion","Historia de Usuario guardada exitosamente :) ");
    	
    	gestionarHistorias(id_proyecto);
    	
    }
    
    
    public static void revisarHistorias(Long id_proyecto){
    	Proyecto proyecto=Proyecto.findById(id_proyecto);    	
    	render(proyecto);
    }
    
    public static void validacionHistoria(Long id_proyecto,Long id_historia, boolean estado){
    	Historia historia=Historia.findById(id_historia);
    	historia.validacion=estado;
    	flash.put("confirmacion","Cambios guardados exitosamente");
    	
    	historia.save();
    	revisarHistorias(id_proyecto);
    	
    }

}
