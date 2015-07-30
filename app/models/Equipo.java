package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Equipo extends Model {
	
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
