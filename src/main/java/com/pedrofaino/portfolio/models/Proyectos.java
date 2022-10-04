package com.pedrofaino.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String fecha;
    private String link;
    private String descripcionP;

    //Constructores
    public Proyectos() {
    }

    public Proyectos(String nombreP, String fecha, String link, String descripcionP) {
        this.nombreP = nombreP;
        this.fecha = fecha;
        this.link = link;
        this.descripcionP = descripcionP;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }
    public String getNombreP() {
        return nombreP;
    }
    public String getFecha() { return fecha; }
    public String getLink() { return link; }
    public String getDescripcionP() {
        return descripcionP;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
    public void setFecha(String fecha){this.fecha=fecha;}
    public void setLink(String link){this.link = link;}
    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

}
