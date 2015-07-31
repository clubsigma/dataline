package controllers;

import models.Tutor;
import play.data.validation.Required;

public class Sesiones extends Secure.Security{
	
		public static void mostrartutor()
		{
			try
				{
					Tutor tutor = Tutor.find("byCedula", Sesiones.connected()).first();
					
					if(Sesiones.isConnected()) 
					{
				        renderArgs.put("conectado", tutor.nombre+" "+tutor.apellido); 
				    }
				}catch(Exception ex){}
		}
		
		 public static boolean check(String a) 
		 {
			 Tutor tutor = Tutor.find("byCedula",Sesiones.connected()).first();
			 return tutor.isAdmin;
		 }
		 
		
		 static boolean authenticate(@Required String username, String password)
		 {
			 Tutor tutor = Tutor.find("byCedula", username).first();
			 return tutor != null && tutor.password.equals(password);       
		 }
		 
		 public static void guardartutor(String cedula,String nombre,String apellido,String email, String password) 
		 throws Throwable
		 				{
						    flash.put("cedula", cedula);
						 	flash.put("nombre", nombre);
							flash.put("apellido", apellido);
							flash.put("email", email);

							
							Tutor tutor = Tutor.find("byCedula",cedula).first(); 
					
							if (tutor == null)
							{
								
								Tutor tutorNuevo = new Tutor(cedula, nombre, apellido, password);
								tutorNuevo.save();
								Secure.authenticate(cedula, password, true);
							}
							else
							{
								flash.put("existente", "Error:el tutor ya existe");
							}
			
		 				}

	}
	

