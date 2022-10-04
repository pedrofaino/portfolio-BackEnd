package com.pedrofaino.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imagen {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String imagenUrl;
    private String imagenId;

    //Constructor    
    public Imagen() {
    }

    public Imagen(String name, String imagenUrl, String imagenId) {
        this.name = name;
        this.imagenUrl = imagenUrl;
        this.imagenId = imagenId;
    }
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public String getImagenId() {
        return imagenId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public void setImagenId(String imagenId) {
        this.imagenId = imagenId;
    }
    
}
