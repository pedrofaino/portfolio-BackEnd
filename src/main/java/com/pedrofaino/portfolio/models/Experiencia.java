package com.pedrofaino.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreExp;
    private String periodo;
    private String url_logo;
    private String descripcionExp;


    //Constructores
    public Experiencia() {
    }

    public Experiencia(String nombreExp, String periodo, String url_logo, String descripcionExp) {
        this.nombreExp = nombreExp;
        this.periodo = periodo;
        this.url_logo = url_logo;
        this.descripcionExp = descripcionExp;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public String getNombreExp() {return nombreExp;}

    public String getPeriodo(){return periodo;}

    public String getUrl_logo(){return url_logo;}

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public void setPeriodo(String periodo){this.periodo = periodo;}

    public void setUrl_logo(String url_logo){this.url_logo = url_logo;}
    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

}
