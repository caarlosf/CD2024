package com.carlosf;

public class Alumno extends Persona{
    private String codigoXade;
    private boolean autorizaTutores;
    
    public String getCodigoXade() {
        return codigoXade;
    }
    public void setCodigoXade(String codigoXade) {
        this.codigoXade = codigoXade;
    }
    public boolean isAutorizaTutores() {
        return autorizaTutores;
    }
    public void setAutorizaTutores(boolean autorizaTutores) {
        this.autorizaTutores = autorizaTutores;
    }
    @Override
    public String toString() {
        return "Alumno [codigoXade=" + codigoXade + ", autorizaTutores=" + autorizaTutores + "]";
    }

}
