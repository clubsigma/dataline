/*MODELO Equipo del proyecto scrum
 * 31/07/2015 jespinelUTC crea la clase con atributos y su constructor
 * 
 */

package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Equipo extends Model{
	
	@ManyToOne
	public Usuario productOwner;
	@ManyToMany
	public List<Usuario> developmentTeam;	
	@ManyToOne
	public Proyecto proyecto;
	
	
	public Equipo(Proyecto proyecto){
		this.proyecto=proyecto;
		
	}
    
}
