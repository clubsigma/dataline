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
        render();
    }
    public static void distributivo() {
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
    
    
    public static void index2() {
		
		Carrera carrera=inicializarU();
		
		render(carrera);
    }
    
    private static Carrera inicializarU() {
 		Carrera carrera = new Carrera();    //Instanciacion de un objeto
 		carrera.addUnidad(1, "CIYA");        
 		carrera.addUnidad(2, "CAREN");        
 		carrera.addUnidad(3, "CCHH");        
 		carrera.save();        //Guardo
 	    return carrera;
 	}
}