package controllers;

import models.Usuario;
import play.mvc.Controller;

public class Usuarios extends Controller {

    public static void registro() {
        render();
    }
    

    
    public static void guardar(String nombre, String apellido, String email, String password, String confirmacionPassword) {
        
    	flash.put("nombre",nombre);
    	flash.put("apellido",apellido);
    	
    	if(password.equals(confirmacionPassword)){
    		
    		Usuario usuario=Usuario.find("byEmail", email).first();		
    		
    		if(usuario==null){
    			
    			usuario=new Usuario(nombre, apellido, password, email);
    			usuario.save();
    			confirmacionRegistro();
;    		}else{
    			flash.put("repetido","El email "+email+" ya está en uso. :(");
    			registro();
    		}
    	}else{
    		flash.put("email",email);
    		flash.put("errorPassword",":(");
    		redirect("/usuarios/registro");
    	}
    }
    
    
    public static void confirmacionRegistro(){
    	render();
    }
    
    

}
