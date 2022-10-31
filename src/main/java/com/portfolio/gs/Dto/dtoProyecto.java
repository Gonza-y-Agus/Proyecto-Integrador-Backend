/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gs.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private int year;
    
    //Constructores

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, int year) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.year = year;
    }
    
    //Getter y Setter

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
