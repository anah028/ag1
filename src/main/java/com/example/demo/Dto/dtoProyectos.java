/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author anilu
 */
public class dtoProyectos {
     @NotBlank
     @Size(min = 1, max = 150, message = "No cumple con los requisitos")
    private String nombreP;
    @NotBlank
    @Size(min = 1, max = 150, message = "No cumple con los requisitos")
    private String descripcionP;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
    }

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
    
}
