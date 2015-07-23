/*
 * HISTORIAL DE MODIFICACIÓN
 * NOMBRE: Documento.java
 * DESCRIPCIÓN: Posee atributos y métodos correspondientes a los archivos que se maneje
 * en la documentación de la Universidad.
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

package models;

import java.util.Date;

import play.db.jpa.Blob;

public class Documento {
    public Date fecha;
    public Blob archivo;

}
