package controllers;

import java.util.List;

import models.Equipo;
import models.Historia;
import models.Proyecto;
import models.Usuario;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

@With(Secure.class)
public class Proyectos extends Controller {
	@Before
	public static void mostrarUsuario(){

			Usuario user = Usuario.find("byEmail", Security.connected()).first();
			if(Security.isConnected()) {
		        renderArgs.put("usuarioConectado", user); 
		    }


	}

    public static void index() {
        render();
    }
    
    public static void guardarProyecto(String tema, String descripcion, String introduccion, String ambito,String alcance){
    	
    	Usuario scrumMaster=Usuario.find("byEmail", Security.connected()).first();
    	Proyecto proyecto1=new Proyecto(tema, descripcion, introduccion, ambito, alcance, scrumMaster);
    	proyecto1.save();
    	Equipo equipo=new Equipo(proyecto1);
    	equipo.save();
    	flash.put("confirmacion","Proyecto guardado exitosamente");
    	
    	listado();
    }
    
    
    public static void listado(){
    	Usuario scrumMaster=Usuario.find("byEmail", Security.connected()).first();
    	List<Proyecto> proyectos=null;
    	try{
    		proyectos=Proyecto.find("byScrumMaster",scrumMaster).fetch();
    	}catch(Exception ex){
    		//
    	}
    	
    	render(proyectos);
    }
    
    
    public static void modificar(Long id){
    	Proyecto proyecto=Proyecto.findById(id);
    	render(proyecto);
    }
    
    
 public static void modificarProyecto(Long id,String tema, String descripcion, String introduccion, String ambito,String alcance){
    	

    	Proyecto proyecto1=Proyecto.findById(id);
    	proyecto1.tema=tema;
    	proyecto1.descripcion=descripcion;
    	proyecto1.introduccion=introduccion;
    	proyecto1.ambito=ambito;
    	proyecto1.alcance=alcance;
    	proyecto1.save();    	
    	flash.put("confirmacion","Proyecto modificado exitosamente");
    	
    	listado();
 }
 
 
 public static void productBacklog(Long id_proyecto){
	 Proyecto proyecto=Proyecto.findById(id_proyecto);
	 

	 render(proyecto);
	 
 }

}
