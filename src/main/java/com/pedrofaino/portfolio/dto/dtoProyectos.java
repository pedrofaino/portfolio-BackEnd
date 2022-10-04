package com.pedrofaino.portfolio.dto;

public class dtoProyectos {

    private String nombreP;
    private String fecha;
    private String link;
    private String descripcionP;

    //Constructores
    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String fecha, String link, String descripcionP) {
        this.nombreP = nombreP;
        this.fecha = fecha;
        this.link = link;
        this.descripcionP = descripcionP;
    }

    //Getters and Setters
    public String getNombreP() {
        return nombreP;
    }
    public String getFecha(){return fecha;}
    public String getLink(){return link;}
    public String getDescripcionP() {
        return descripcionP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
    public void setFecha(String fecha){this.fecha = fecha;}
    public void setLink(String link){this.link = link;}
    public void setDescripcionP(String descripcionP) {this.descripcionP = descripcionP;}

}
