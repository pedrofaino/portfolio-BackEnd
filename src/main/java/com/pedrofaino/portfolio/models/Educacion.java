package com.pedrofaino.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEdu;
    private String fecha;
    private String url_foto;
    private String descripcionEdu;


    //Constructores

    public Educacion() {
    }

    public Educacion(String nombreEdu, String descripcionEdu, String fecha, String url_foto) {
        this.nombreEdu = nombreEdu;
        this.fecha = fecha;
        this.url_foto = url_foto;
        this.descripcionEdu = descripcionEdu;
    }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public String getUrl_foto(){
        return url_foto;
    }


    public String getFecha(){
        return fecha;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

}
