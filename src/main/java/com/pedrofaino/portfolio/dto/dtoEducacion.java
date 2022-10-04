package com.pedrofaino.portfolio.dto;


public class dtoEducacion {
    private String nombreEdu;
    private String fecha;
    private String url_foto;
    private String descripcionEdu;
    
    //Constructores
    public dtoEducacion(){
        
    }

    public dtoEducacion(String nombreEdu, String descripcionEdu, String fecha, String url_foto) {
        this.nombreEdu = nombreEdu;
        this.fecha = fecha;
        this.url_foto = url_foto;
        this.descripcionEdu = descripcionEdu;
    }
    
    //Getters and Setters

    public String getNombreEdu() {
        return nombreEdu;
    }

    public String getFecha(){return fecha;}

    public String getUrl_foto(){return url_foto;}

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public void setFecha (String fecha){this.fecha = fecha;}

    public void setUrl_foto(String url_foto){this.url_foto = url_foto;}

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

}
