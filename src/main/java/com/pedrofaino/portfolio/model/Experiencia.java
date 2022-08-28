package com.pedrofaino.portfolio.model;

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
    private String descripcionExp;

    //Constructores
    public Experiencia() {
    }

    public Experiencia(String nombreExp, String descripcionExp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

}
