package controllers;

import models.Usuario;

import org.junit.Before;

public class Security extends Secure.Security{

   public static boolean authenticate(String username, String password) {
		 Usuario user = Usuario.find("byEmail", username).first();
	     return user != null && user.password.equals(password);
	}


}
