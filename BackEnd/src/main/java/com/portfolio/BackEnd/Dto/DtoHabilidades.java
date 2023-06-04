package com.portfolio.BackEnd.Dto;

import javax.validation.constraints.NotBlank;

public class DtoHabilidades {
    @NotBlank
    private String nombreHabilidad;
    @NotBlank
    private int porcentaje;
    
    //constructos

    public DtoHabilidades() {
    }

    public DtoHabilidades(String nombreHabilidad, int porcentaje) {
        this.nombreHabilidad = nombreHabilidad;
        this.porcentaje = porcentaje;
    }
    //getters setters

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
