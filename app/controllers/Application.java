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
    
    public static void creditos() {
        render();
    }
}