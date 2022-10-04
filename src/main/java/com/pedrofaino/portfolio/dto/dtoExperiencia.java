package com.pedrofaino.portfolio.dto;

public class dtoExperiencia {

    private String nombreExp;

    private String periodo;

    private String url_logo;
    private String descripcionExp;

    //Constructores
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String periodo, String url_logo, String descripcionExp) {
        this.nombreExp = nombreExp;
        this.periodo= periodo;
        this.url_logo = url_logo;
        this.descripcionExp = descripcionExp;
    }

    //Getters and Setters

    public String getNombreExp() {
        return nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public String getPeriodo() {return periodo;}

    public String getUrl_logo() {return url_logo;}

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public void setPeriodo(String periodo){this.periodo = periodo;}

    public void setUrl_logo(String url_logo){this.url_logo = url_logo;}

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }


}
