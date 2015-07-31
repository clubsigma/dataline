package controllers;

import java.util.List;

import models.Equipo;
import models.Proyecto;
import models.Usuario;
import play.mvc.*;

public class Equipos extends Controller {
	@Before
	public static void mostrarUsuario(){

			Usuario user = Usuario.find("byEmail", Security.connected()).first();
			if(Security.isConnected()) {
		        renderArgs.put("usuarioConectado", user); 
		    }


	}

    public static void index() {
    	List<Equipo> equipos=Equipo.findAll();
        render(equipos);
    }
    
    
    public static void gestionarEquipo(Long id_proyecto){
    	Proyecto proyecto=Proyecto.findById(id_proyecto);
    	Equipo equipo=Equipo.find("byProyecto",proyecto).first();
    	
    	
    	List<Usuario> usuarios=Usuario.findAll();
    	    		
    	for(Usuario u:equipo.developmentTeam){
    		usuarios.remove(u);
    	}
    	
    	render(equipo,usuarios);
    }
    
    public static void agregarProductOwner(Long id_equipo,Long id_usuario){
    	
    	Equipo equipo=Equipo.findById(id_equipo);
    	Usuario productOwner=Usuario.findById(id_usuario);
    	
    	equipo.productOwner=productOwner;
    	equipo.save();
    	flash.put("confirmacionProduct","Product Owner agregado exitosamente :)");
    	
    	gestionarEquipo(equipo.proyecto.id);
    	
    }
    
    public static void agregarDevelopmentTeam(Long id_equipo,Long id_usuario){
    	Equipo equipo=Equipo.findById(id_equipo);
    	Usuario developer=Usuario.findById(id_usuario);
    	equipo.developmentTeam.add(developer);
    	equipo.save();
    	flash.put("confirmacionDeveloper","Desarollador agregado exitosamente :)");
    	
    	gestionarEquipo(equipo.proyecto.id);
    }
    
    

}
