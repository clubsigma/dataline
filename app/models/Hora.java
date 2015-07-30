package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class Hora extends Model{
    private String horaFin;
    private String horaInicio;

}
