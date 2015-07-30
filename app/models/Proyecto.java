package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Proyecto extends Model {
	
	@Column(columnDefinition = "TEXT",length=40000)
	public String tema;
	@Column(columnDefinition = "TEXT",length=40000)
	public String descripcion;
	@Column(columnDefinition = "TEXT",length=40000)
	public String introduccion;
	@Column(columnDefinition = "TEXT",length=40000)
	public String ambito;
	@Column(columnDefinition = "TEXT",length=40000)
	public String alcance;
	
	@ManyToOne
	public Usuario scrumMaster;
	
	@ManyToMany
	public List<Historia> historias;

	public Proyecto(String tema, String descripcion, String introduccion,
			String ambito, String alcance, Usuario scrumMaster) {
		super();
		this.tema = tema;
		this.descripcion = descripcion;
		this.introduccion = introduccion;
		this.ambito = ambito;
		this.alcance = alcance;
		this.scrumMaster = scrumMaster;
	}
	
    
}
